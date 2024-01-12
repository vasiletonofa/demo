package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest
public class UserTekwillServiceMockTest {

    @Autowired
    UserService userService;

    @MockBean      // spune ca userRepository nu va mai apela DB
    UserRepository userRepository;

    @Test
    public void testGetUser() {

        UserTekwill userTekwill = new UserTekwill("Ion", "ADMIN");

        Mockito.when(userRepository.findByName(anyString())).thenReturn(Optional.of(userTekwill)); // in loc sa apelam DB return 'user'

        UserTekwill response = userService.getUserByName("Vasile").get();

        Assertions.assertEquals("Ion", response.getName());
        Assertions.assertEquals("ADMIN", response.getRole());
    }

    @Test
    public void createUser() {
        Mockito.when(userRepository.save(any())).thenReturn(new UserTekwill("David", "ADMIN"));

        UserTekwill userTekwill = new UserTekwill("David", "ADMIN");
        UserTekwill response = userService.createUser(userTekwill);

        Assertions.assertEquals("David", response.getName());
        Assertions.assertEquals("ADMIN", response.getRole());
    }

}
