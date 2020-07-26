package com.example.observer.demo;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        numberGenerator.addObserver(new DigitObserver());
        numberGenerator.addObserver(new DigitObserver());
        numberGenerator.addObserver(new DigitObserver());
        numberGenerator.addObserver(new DigitObserver());
        numberGenerator.addObserver(new DigitObserver());
        numberGenerator.addObserver(new GraphObserver());
        numberGenerator.addObserver(new GraphObserver());
        numberGenerator.addObserver(new GraphObserver());
        numberGenerator.addObserver(new GraphObserver());
        numberGenerator.addObserver(new GraphObserver());
        numberGenerator.addObserver(new GraphObserver());
        numberGenerator.addObserver(new GraphObserver());
        numberGenerator.execute();
    }
}
