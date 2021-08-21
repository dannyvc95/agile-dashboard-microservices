package com.dashboard.dashboard.user;

import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PutMapping(path = "/add")
    public User addUser(@NotNull @RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUser(@NotNull @PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

    @PostMapping(path = "/update")
    public User updateUser(@NotNull @RequestBody User user) {
        return userService.updateUser(user);
    }
}
