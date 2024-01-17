package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterFirstService {

    @Autowired
    private SpringCounter springCounter;

    public void afisareCountor() {
        System.out.println(springCounter.getCounter());
    }

    public void setSpringCounter(int count) { // 5
        springCounter.setCounter(count);
    }

}
