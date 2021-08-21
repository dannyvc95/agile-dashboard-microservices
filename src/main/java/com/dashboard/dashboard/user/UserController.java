package com.dashboard.dashboard.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PutMapping
    public User addUser(@NonNull User user) {
        return userService.addUser(user);
    }

    @DeleteMapping
    public void deleteUser(@NonNull Long id) {
        userService.deleteUser(id);
    }

    @PostMapping
    public void updateUser(@NonNull User user) {
        // TODO: Implement update endpoint.
    }
}
