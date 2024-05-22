package org.Vinayak.DesignPattern.StructuralDesignPattern.Facade;

public class HomeTheaterFacade {
    private Tv tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(Tv tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        tv.on();
        tv.setChannel(3);
        soundSystem.on();
        soundSystem.setVolume(20);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.off();
        soundSystem.off();
        tv.off();
    }
}
