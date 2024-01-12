package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class UserTekwillServiceTest {

    // Unit tests
      //  Mock tests
    // Integration test - Testam un functional

    // Development (Dezvoltare de soft) -> Testare -> Integration Tests -> Deployment to Production ( rularea schimbarilor pe server accesibil pentru clienti)
                                      // Develpment <-
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @BeforeEach // ruleaza inainte de fiecare test
    public void before() {
        userRepository.save(new UserTekwill("Mihail", "ADMIN"));
        userRepository.save(new UserTekwill("Ion", "POWER-USER"));
    }

    @Test
    public void addUser() {
        UserTekwill userTekwill = new UserTekwill("Robert", "ADMIN");
        userService.createUser(userTekwill);
    }

    @Test
    public void getAllUsers() {
        List<UserTekwill> userTekwills = userService.getAllUsers();

        UserTekwill firstUser = userTekwills.get(0);
        UserTekwill secondUser = userTekwills.get(1);

        Assertions.assertEquals(2, userTekwills.size());
        Assertions.assertEquals("Mihail", firstUser.getName());
        Assertions.assertEquals("ADMIN", firstUser.getRole());
        Assertions.assertEquals("Ion", secondUser.getName());
        Assertions.assertEquals("POWER-USER",secondUser.getRole());
    }

    @Test
    public void testDelete() {
        // Before
        Optional<UserTekwill> user = userService.getUserByName("Ion");
        Assertions.assertTrue(user.isPresent());
        Assertions.assertEquals("Ion", user.get().getName());
        Assertions.assertEquals("POWER-USER", user.get().getRole());

        // Action
        userService.deleteById(user.get().getId());

        // After
        Optional<UserTekwill> userAfter = userService.getUserByName("Ion");
        Assertions.assertFalse(userAfter.isPresent());

    }



}
