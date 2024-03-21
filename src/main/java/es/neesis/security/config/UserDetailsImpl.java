package es.neesis.security.config;

import es.neesis.security.model.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.HashSet;

public class UserDetailsImpl {

    private String username;
    private String password;
    private Collection<SimpleGrantedAuthority> roles;

    public UserDetailsImpl(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.roles = new HashSet<>(user.getAuthority().size());
        user.getAuthority().forEach(authority ->{
            this.roles.add(new SimpleGrantedAuthority("ROLE_" + authority.getRole()));
        });
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


}
