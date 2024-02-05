package org.dosi.csa_project_backend.request;

import lombok.Data;

@Data
public class JWTAuthentifivationResponse {

    private String token;
    private String refreshToken;
}
