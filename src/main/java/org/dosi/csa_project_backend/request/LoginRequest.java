package org.dosi.csa_project_backend.request;

import lombok.Data;

@Data
public class LoginRequest {

    private String email;
    private String password;
}
