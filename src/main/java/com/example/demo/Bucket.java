package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Bucket {

    private final List<String> fruits; // 120

    public Bucket(List<String> fruits) { // 90
        this.fruits = new ArrayList<>(fruits); // 120
    }

    public List<String> getFruits() {
        return new ArrayList<>(fruits);
    }

//    public int getBucketSize() {
//        return fruits.size();
//    }
//
//    public boolean contains(String fruit) {
//        return fruits.contains(fruit);
//    }

}
