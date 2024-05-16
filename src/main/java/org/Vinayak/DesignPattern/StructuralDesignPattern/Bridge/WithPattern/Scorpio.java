package org.Vinayak.DesignPattern.StructuralDesignPattern.Bridge.WithPattern;

// Concrete Implementor 1
public class Scorpio implements Cars{
    @Override
    public void switchOn() {
        System.out.println("Welcome to Scorpio. You are driving an powerful engine");
    }

    @Override
    public void switchOff() {
        System.out.println("Horse on a rest");
    }

    @Override
    public void drive() {
        System.out.println("You are driving an Scorpio.");
    }
}
