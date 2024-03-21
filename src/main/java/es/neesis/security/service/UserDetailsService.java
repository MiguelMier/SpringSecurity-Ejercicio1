package es.neesis.security.service;

import es.neesis.security.model.User;

public interface UserDetailsService {

    void checkUser(User user);
    User getUserById(String username);
}
