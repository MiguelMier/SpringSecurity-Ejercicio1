package es.neesis.security.model;

import jakarta.persistence.*;

@Entity
public class Role {

    private String username;

    @Column(nullable = false)
    private String role;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
