package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest // Unit Tests -> Unit
public class PersonServiceTest {

    @Autowired
    PersonService personService;

    @Test
    public void testCreatePerson() {
        // Before
        List<String> peopleBefore = personService.getPersonList();
        Assertions.assertEquals(0, peopleBefore.size());

        // Action
        personService.addPerson("Ion");

        // After
        List<String> people = personService.getPersonList();
        Assertions.assertEquals(1, people.size());
        Assertions.assertEquals("Ion", people.get(0));
    }

}
