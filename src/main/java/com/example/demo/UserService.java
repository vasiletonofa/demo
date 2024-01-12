package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositoryPaginated userRepositoryPaginated;

    @Autowired
    private UserRepository userRepository;


    public Optional<UserTekwill> getUserByName(String name) {
        // business logic
        return userRepository.findByName(name);
    }

    public UserTekwill createUser(UserTekwill userTekwill) {
       return userRepository.save(userTekwill);
    }

    public List<UserTekwill> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    public Page<UserTekwill> getAllUsersPaginated(
            int page,
            int pageSize,
            String name,
            String role,
            String sortBy,
            String direction) {

        Page<UserTekwill> userPage = null;
        Pageable pageable = PageRequest.of(page, pageSize, Sort.Direction.valueOf(direction), sortBy);

        if(!role.isBlank() && !name.isBlank()) { // name = "sdsd" -> !false -> true
            userPage = userRepositoryPaginated.findAllByNameAndRole(pageable, name, role);
        } else if (!role.isBlank()) {
            userPage = userRepositoryPaginated.findAllByRole(pageable, role);
        } else if(!name.isBlank()) {
            userPage = userRepositoryPaginated.findAllByName(pageable, name);
        } else {
            userPage = userRepositoryPaginated.findAll(pageable);
        }

        return userPage;
    }


}
