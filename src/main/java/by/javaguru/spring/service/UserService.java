package by.javaguru.spring.service;

import by.javaguru.spring.database.model.User;
import by.javaguru.spring.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUserById(Integer id) {
        return userRepository.findUserById(id);
    }
}
