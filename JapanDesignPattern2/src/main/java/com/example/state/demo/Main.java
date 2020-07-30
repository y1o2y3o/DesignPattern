package com.example.state.demo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SafeFrame frame = new SafeFrame("State Sample");

        while(true){
            for(int hour = 0; hour < 24;++hour){
                frame.setClock(hour);
                Thread.sleep(1000);
            }
        }
    }
}
