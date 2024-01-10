package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {

    List<String> names = new ArrayList<>();

    public void addPerson(String name) {
        names.add(name);
    }

    public List<String> getPersonList() {
        return names;
    }

}
