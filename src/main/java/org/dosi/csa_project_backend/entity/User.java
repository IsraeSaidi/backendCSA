package org.dosi.csa_project_backend.entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "code_prof")
    private String codeProf;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return email; // Utiliser l'e-mail comme nom d'utilisateur
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Ajuster si nécessaire
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Ajuster si nécessaire
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Ajuster si nécessaire
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeProf() {
        return codeProf;
    }

    public void setCodeProf(String codeProf) {
        this.codeProf = codeProf;
    }
}
