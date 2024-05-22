package org.Vinayak.DesignPattern.StructuralDesignPattern.Facade;

public class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON");
    }

    public void off() {
        System.out.println("Sound System is OFF");
    }

    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume);
    }
}
