package org.Vinayak.DesignPattern.StructuralDesignPattern.Adaptor;

// Adaptee: Specific audio player for MP3 files
public class MP3Player {
    public void playMP3(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}
