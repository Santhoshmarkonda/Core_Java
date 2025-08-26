package com.abstraction;

interface Controllable {
    void turnOn();
    void turnOff();
}

abstract class SmartAppliance {
    String brand;
    boolean status;

    SmartAppliance(String brand) {
        this.brand = brand;
        this.status = false;
    }

    void showStatus() {
        String state = status ? "ON" : "OFF";
        System.out.println("Status: " + brand + " - " + state);
    }
}

class SmartFan extends SmartAppliance implements Controllable {
    private int speed;

    SmartFan(String brand) {
        super(brand);
    }

    public void turnOn() {
        status = true;
        System.out.println("Fan [" + brand + "] turned ON");
    }

    public void turnOff() {
        status = false;
        System.out.println("Fan [" + brand + "] turned OFF");
    }

    void setSpeed(int level) {
        if (status) {
            speed = level;
            System.out.println("Fan speed set to " + speed);
        } else {
            System.out.println("Turn ON the fan before setting speed.");
        }
    }
}

class SmartAC extends SmartAppliance implements Controllable {
    private int temperature;

    SmartAC(String brand) {
        super(brand);
    }

    public void turnOn() {
        status = true;
        System.out.println("AC [" + brand + "] turned ON");
    }

    public void turnOff() {
        status = false;
        System.out.println("AC [" + brand + "] turned OFF");
    }

    void setTemperature(int temp) {
        if (status) {
            temperature = temp;
            System.out.println("Temperature set to " + temperature + "°C");
        } else {
            System.out.println("Turn ON the AC before setting temperature.");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        SmartFan fan = new SmartFan("Dyson");
        fan.turnOn();
        fan.setSpeed(3);
        fan.showStatus();

        System.out.println();

        SmartAC ac = new SmartAC("Samsung");
        ac.turnOn();
        ac.setTemperature(24);
        ac.showStatus();

        System.out.println();

        fan.turnOff();
        fan.showStatus();
    }
}


