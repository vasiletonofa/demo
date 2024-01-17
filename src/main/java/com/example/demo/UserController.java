package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController { // http://localhost:8080/user/create         { JSON USER }        // HOW TO CREATE SOAP API

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public void createUser(@RequestBody UserTekwill userTekwill) {
        userRepository.save(userTekwill);
    }

    @GetMapping("/all")
    public List<UserTekwill> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/all/paginated")
    public Page<UserTekwill> getAllUserPaginated(
            @RequestParam int page,
            @RequestParam int pageSize,
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "") String role,
            @RequestParam(defaultValue = "name") String sortBy,
            @RequestParam(defaultValue = "ASC") String direction
    ) {
       return userService.getAllUsersPaginated(page, pageSize, name, role, sortBy, direction);
    }

}
