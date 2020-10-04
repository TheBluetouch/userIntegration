package pl.kacperBogusz.userIntegration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kacperBogusz.userIntegration.model.User;
import pl.kacperBogusz.userIntegration.request.AddUserRequest;
import pl.kacperBogusz.userIntegration.service.UserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private UserService service;

    public UserController(UserService userService) {
        this.service = userService;
    }

    @PostMapping
    public ResponseEntity<User> addUser(
            @RequestBody @Valid AddUserRequest request) {
        User user = service.addUserRequest(request);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {

        List<User> allUsers = service.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }

    @GetMapping("external/{id}")
    public User userDataForCarApp(@PathVariable Long id) {

        User user = service.findUserById(id);
        return user;
    }


}
