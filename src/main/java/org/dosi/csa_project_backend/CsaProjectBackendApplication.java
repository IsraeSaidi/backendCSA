package org.dosi.csa_project_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CsaProjectBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(CsaProjectBackendApplication.class, args);
        String password = "admin";

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);

        System.out.println("Mot de passe original : " + password);
        System.out.println("Mot de passe haché : " + hashedPassword);
    }

}
