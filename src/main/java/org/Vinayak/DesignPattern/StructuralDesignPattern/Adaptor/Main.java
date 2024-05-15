package org.Vinayak.DesignPattern.StructuralDesignPattern.Adaptor;

public class Main {

    /*
    * Adaptor design pattern uses inheritance and composition to
    * enable objects with incompatible interfaces to collaborate
    * with one another
    *
    * For that it creates middle-layer class that servers as s
    * translator.
    *
    * Applies single responsibility and open-closed principles.
    */

   /*
    In this example:
    * MP3Player represents a specific audio player for MP3 files.
    * AdvancedAudioPlayer is the interface expected by the client application,
      defining a common method for playing audio files.
    * MP3PlayerAdapter adapts the specific method playMP3 of MP3Player to the AdvancedAudioPlayer interface.
    * MediaPlayer is the client code that interacts with audio players via the AdvancedAudioPlayer interface.
    * By using the Adapter pattern, the client code can seamlessly work with different types of audio players
      without needing to know their specific implementations.
    */

    public static void main(String[] args){
        // Using MP3Player
        MP3Player mp3Player = new MP3Player();
        AdvancedAudioPlayer mp3PlayerAdapter = new MP3PlayerAdapter(mp3Player);
        MediaPlayer mediaPlayer1 = new MediaPlayer(mp3PlayerAdapter);
        mediaPlayer1.playAudio("song.mp3");

        // Using a different audio player (e.g., for WAV files)
        // This player doesn't exist yet, but you could create one and adapt it similarly.
        // AdvancedAudioPlayer wavPlayerAdapter = new WAVPlayerAdapter(wavPlayer);
        // MediaPlayer mediaPlayer2 = new MediaPlayer(wavPlayerAdapter);
        // mediaPlayer2.playAudio("song.wav");
    }
}
