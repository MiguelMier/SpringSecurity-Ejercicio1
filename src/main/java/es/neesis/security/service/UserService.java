package es.neesis.security.service;

import es.neesis.security.config.UserDetailsImpl;
import es.neesis.security.model.User;
import es.neesis.security.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserService implements IUserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void checkUser(User user) {

    }

    @Override
    public Optional<User> getUserById(String username) {
        return userRepository.findById(username);
    }

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userEntity = userRepository.findById(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new UserDetailsImpl(userEntity.get());
    }


}
