package com.example.mongoApi.service;

import com.example.mongoApi.model.User;
import com.example.mongoApi.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Map<String, Object> getAllUser(int page, int records) {
        Pageable pageable = PageRequest.of(page - 1, records);
        Page<User> userPage = userRepository.findAll(pageable);
        List<User> users = userPage.getContent();
        Map<String, Object> res = new HashMap<>();
        res.put("results", users);
        res.put("currentPage", userPage.getNumber() + 1);
        res.put("totalItems", userPage.getTotalElements());
        res.put("totalPages", userPage.getTotalPages());
        return res;
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public User setUser(User user) {
        return userRepository.save(user);
    }

    public User updateUserById(User user1, User user) {
        return userRepository
                .save(new User(user1.getId(), user.getFirstname(), user.getLastname(), user.getEmail(), user.getPhone(), user.getAddress(), user.getBirthday(), user.getAvatar()));
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    public boolean existsUserById(String id) {
        return userRepository.existsById(id);
    }

    /*public User getUserByQuery(Query query) {
        return userRepository.findAll(query);
    }*/
}
