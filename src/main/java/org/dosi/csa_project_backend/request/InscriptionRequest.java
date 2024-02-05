package org.dosi.csa_project_backend.request;

import lombok.Data;

@Data
public class InscriptionRequest {
    private String nom;
    private String code_prof;
    private String email;
    private String password;
}
