package es.neesis.security.model;

import jakarta.persistence.*;
import org.springframework.security.authentication.jaas.AuthorityGranter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="USER")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @Column(name = "username")
    @OneToMany(mappedBy="username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToMany
    Set<Role> authority;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getAuthority() {
        return authority;
    }

    public void setAuthority(Set<Role> authority) {
        this.authority = authority;
    }
}
