package org.Vinayak.DesignPattern.StructuralDesignPattern.Decorator;

public class Main {

    public static void main(String[] args){
        Mobile mobile = new ScreenGuard(new BackCover(new IPhone()));
        System.out.println(mobile.getCost());
    }
}
