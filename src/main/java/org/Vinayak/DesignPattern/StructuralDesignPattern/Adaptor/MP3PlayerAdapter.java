package org.Vinayak.DesignPattern.StructuralDesignPattern.Adaptor;

public class MP3PlayerAdapter implements AdvancedAudioPlayer{

    //Composition used
    private MP3Player mp3Player;

    public MP3PlayerAdapter(MP3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    //Inheritance used
    @Override
    public void play(String fileName) {
        mp3Player.playMP3(fileName);
    }
}
