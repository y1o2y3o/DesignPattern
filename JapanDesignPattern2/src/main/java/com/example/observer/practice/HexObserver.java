package com.example.observer.practice;

public class HexObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();

        System.out.println("HexObserver: "+Integer.toHexString(number));
    }
}
