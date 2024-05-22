package org.Vinayak.DesignPattern.StructuralDesignPattern.Facade;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, dvdPlayer);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
