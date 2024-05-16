package org.Vinayak.DesignPattern.StructuralDesignPattern.Bridge.WithPattern;

// Abstraction
abstract class Drive {

    private Cars cars;

    Drive(Cars cars){
        this.cars = cars;
    }

    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void drive();
}
