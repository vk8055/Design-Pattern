package org.Vinayak.DesignPattern.StructuralDesignPattern.Bridge.WithPattern;

// Concrete Implementor 2
public class Endeavour implements Cars{
    @Override
    public void switchOn() {
        System.out.println("Endeavour started");
    }

    @Override
    public void switchOff() {
        System.out.println("Endeavour stopped.");
    }

    @Override
    public void drive() {
        System.out.println("Endeavour is running");
    }
}
