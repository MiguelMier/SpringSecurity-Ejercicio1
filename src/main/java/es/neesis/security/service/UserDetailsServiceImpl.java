package es.neesis.security.service;

import es.neesis.security.model.User;
import es.neesis.security.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void checkUser(User user) {

    }

    @Override
    public User getUserById(String username) {
        return userRepository.findByUsername(username);
    }

}
