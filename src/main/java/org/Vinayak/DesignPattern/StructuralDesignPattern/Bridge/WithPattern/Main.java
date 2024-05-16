package org.Vinayak.DesignPattern.StructuralDesignPattern.Bridge.WithPattern;

public class Main {
    public static void main(String[] args){
        Drive drive = new Employee(new Scorpio());
        drive.powerOn();
        drive.drive();
        drive.powerOff();
    }
}
