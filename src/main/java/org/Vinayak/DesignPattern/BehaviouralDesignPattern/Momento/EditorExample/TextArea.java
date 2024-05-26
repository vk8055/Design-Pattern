package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Momento.EditorExample;

public class TextArea {

    private String text;

    public void set(String text){
        this.text = text;
    }

    public Momento takeSnapshot(){
        return new Momento(this.text);
    }

    public void restore(Momento momento){
        this.text = momento.getSavedText();
    }

    public static class Momento {
        private final String text;

        private Momento(String textToSave){
            text = textToSave;
        }

        private String getSavedText(){
            return text;
        }
    }
}
