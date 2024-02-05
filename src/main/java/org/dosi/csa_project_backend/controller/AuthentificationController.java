package org.dosi.csa_project_backend.controller;

import lombok.RequiredArgsConstructor;
import org.dosi.csa_project_backend.entity.User;
import org.dosi.csa_project_backend.request.InscriptionRequest;
import org.dosi.csa_project_backend.request.JWTAuthentifivationResponse;
import org.dosi.csa_project_backend.request.LoginRequest;
import org.dosi.csa_project_backend.request.RefreshTokenRequest;
import org.dosi.csa_project_backend.service.AuthentificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthentificationController {

    private final AuthentificationService authentificationService;

    @PostMapping("/s'inscrire")
    public ResponseEntity<User> inscrire(@RequestBody InscriptionRequest inscriptionRequest){
        return ResponseEntity.ok(authentificationService.inscrire(inscriptionRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<JWTAuthentifivationResponse> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authentificationService.login(loginRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JWTAuthentifivationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authentificationService.refreshToken(refreshTokenRequest));
    }
}
