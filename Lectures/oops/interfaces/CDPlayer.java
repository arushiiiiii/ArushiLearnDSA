package com.oops.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Starting the music");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the music");
    }
}
