package org.Vinayak.DesignPattern.StructuralDesignPattern.Adaptor;

public class MediaPlayer {

    private AdvancedAudioPlayer audioPlayer;

    public MediaPlayer(AdvancedAudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void playAudio(String fileName) {
        audioPlayer.play(fileName);
    }
}
