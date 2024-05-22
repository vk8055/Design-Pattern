package org.Vinayak.DesignPattern.StructuralDesignPattern.Facade;

public class Tv {
    public void on() {
        System.out.println("TV is ON");
    }

    public void off() {
        System.out.println("TV is OFF");
    }

    public void setChannel(int channel) {
        System.out.println("TV channel set to " + channel);
    }
}
