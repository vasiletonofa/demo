package com.example.demo;

public class Timer {
    public int timp;

    public static final Timer timer = new Timer();

    public void setTimp(int timp) {
        this.timp = timp;
    }

    public int getTimp() {
        return timp;
    }

    public static Timer getInstance() {
        return timer;
    }
}
