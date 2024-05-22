package org.Vinayak.DesignPattern.StructuralDesignPattern.Facade;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}
