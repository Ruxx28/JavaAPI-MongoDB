package com.example.mongoApi.controller;

import com.example.mongoApi.exception.ErrorMessage;
import com.example.mongoApi.model.User;
import com.example.mongoApi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<?> getAllUser(
            @RequestParam(value = "records", defaultValue = "10",required = false) int records,
            @RequestParam(value = "page", defaultValue = "1", required = false) int page) {
            return ResponseEntity.ok().body(userService.getAllUser(page, records));
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) throws URISyntaxException {
        URI location = new URI("/users");
        return ResponseEntity.created(location).body(userService.setUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id).map(value -> ResponseEntity.ok().body(value))
                .orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateUserById(@PathVariable("id") String id, @RequestBody User user) throws Exception {
        return userService.getUserById(id).map(value -> ResponseEntity.ok().body(userService.updateUserById(value, user)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") String id) {
       if(!userService.existsUserById(id)) return ResponseEntity.notFound().build();
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

    /*@GetMapping("/{q}")
    public ResponseEntity<User> getUserByQuery(@PathVariable Query q) {
        try {
            return new ResponseEntity<>(userService.getUserByQuery(q), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
