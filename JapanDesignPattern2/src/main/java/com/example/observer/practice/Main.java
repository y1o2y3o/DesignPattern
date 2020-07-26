package com.example.observer.practice;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new IncrementalNumberGenerator(10, 50, 5);
        numberGenerator.addObserver(new DigitObserver());

        numberGenerator.addObserver(new HexObserver());
        numberGenerator.execute();
    }
}
