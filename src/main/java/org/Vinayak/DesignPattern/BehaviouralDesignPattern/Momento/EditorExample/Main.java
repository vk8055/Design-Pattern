package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Momento.EditorExample;

public class Main {

    public static void main(String[] args){
        Editor editor = new Editor();
        editor.write("Hey");
        editor.write("Hey there");
        editor.undo();
    }
}
