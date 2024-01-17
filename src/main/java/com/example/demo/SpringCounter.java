package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SpringCounter { // Obiectul creat de Spring este Singleton

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
