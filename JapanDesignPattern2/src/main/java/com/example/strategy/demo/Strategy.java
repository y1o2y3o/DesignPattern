package com.example.strategy.demo;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
