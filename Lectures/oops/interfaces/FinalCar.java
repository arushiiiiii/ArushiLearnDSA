package com.oops.interfaces;

public class FinalCar {
    private Engine engine;
    private Media player = new CDPlayer();


    public FinalCar() {
        engine = new PowerEngine();
    }

    public FinalCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
