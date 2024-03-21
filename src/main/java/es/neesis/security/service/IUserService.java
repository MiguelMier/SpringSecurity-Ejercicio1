package es.neesis.security.service;

import es.neesis.security.config.UserDetailsImpl;
import es.neesis.security.model.User;

import java.util.Optional;

public interface IUserService {

    void checkUser(User user);
    Optional<User> getUserById(String username);
    UserDetailsImpl loadUserByUsername(String username);
}
