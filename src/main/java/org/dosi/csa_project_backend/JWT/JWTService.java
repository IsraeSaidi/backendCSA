package org.dosi.csa_project_backend.JWT;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JWTService {
    String extractUserName(String jwt);

    String generateToken(UserDetails userDetails);

    public String generateRefreshToken(Map<String, Object> extraClaims, UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);
}
