package com.oops.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.accelerate();
//        car.brake();
//        car.start();
//        car.stop();

        // on using the car simply, even if we try to stop the music, the engine stops

//        Media carMedia = new Car();
//        carMedia.stop();

        FinalCar car = new FinalCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
