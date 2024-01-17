package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterSecondService {

    @Autowired
    private SpringCounter springCounter;

    public void afisareCountor() { // 5
        System.out.println(springCounter.getCounter());
    }

    public void setSpringCounter(int count) {
        springCounter.setCounter(count);
    }

}
