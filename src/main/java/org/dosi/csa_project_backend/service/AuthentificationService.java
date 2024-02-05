package org.dosi.csa_project_backend.service;

import lombok.RequiredArgsConstructor;
import org.dosi.csa_project_backend.JWT.JWTService;
import org.dosi.csa_project_backend.Repository.UserRepository;
import org.dosi.csa_project_backend.controller.AuthentificationController;
import org.dosi.csa_project_backend.entity.Role;
import org.dosi.csa_project_backend.entity.User;
import org.dosi.csa_project_backend.request.InscriptionRequest;
import org.dosi.csa_project_backend.request.JWTAuthentifivationResponse;
import org.dosi.csa_project_backend.request.LoginRequest;
import org.dosi.csa_project_backend.request.RefreshTokenRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class AuthentificationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JWTService jwtService;

    public User inscrire(InscriptionRequest inscriptionRequest){
        User user = new User();
        user.setEmail(inscriptionRequest.getEmail());
        user.setPassword(passwordEncoder.encode(inscriptionRequest.getPassword()));
        user.setNom(inscriptionRequest.getNom());
        user.setRole(Role.ETUDIANT);
        return userRepository.save(user);

    }

    public JWTAuthentifivationResponse login(LoginRequest loginRequest){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginRequest.getEmail(), loginRequest.getPassword()
        ));
        var user = userRepository.findByEmail(loginRequest.getEmail()).orElseThrow(()-> new IllegalArgumentException("Invalid email ou password"));
        var jwt = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefreshToken(new HashMap<>(),user);

        JWTAuthentifivationResponse jwtAuthentifivationResponse = new JWTAuthentifivationResponse();
        jwtAuthentifivationResponse.setToken(jwt);
        jwtAuthentifivationResponse.setRefreshToken(refreshToken);
        return jwtAuthentifivationResponse;
    }

    public JWTAuthentifivationResponse refreshToken(RefreshTokenRequest refreshTokenRequest){
        String userEmail = jwtService.extractUserName(refreshTokenRequest.getToken());
        User user = userRepository.findByEmail(userEmail).orElseThrow();
        if(jwtService.isTokenValid(refreshTokenRequest.getToken(), user)){
            var jwt = jwtService.generateToken(user);
            JWTAuthentifivationResponse jwtAuthentifivationResponse = new JWTAuthentifivationResponse();
            jwtAuthentifivationResponse.setToken(jwt);
            jwtAuthentifivationResponse.setRefreshToken(refreshTokenRequest.getToken());
            return jwtAuthentifivationResponse;

        }
        return null;
    }
}
