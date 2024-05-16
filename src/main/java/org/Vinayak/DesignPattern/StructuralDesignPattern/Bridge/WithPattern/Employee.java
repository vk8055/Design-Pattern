package org.Vinayak.DesignPattern.StructuralDesignPattern.Bridge.WithPattern;

//Refined abstraction
public class Employee extends Drive{

    private Cars cars;

    Employee(Cars cars){
        super(cars);
        this.cars = cars;
    }

    @Override
    public void powerOn() {
        System.out.println("Employee stated car");
        cars.switchOn();
    }

    @Override
    public void powerOff() {
        System.out.println("Employee stopped car");
        cars.switchOff();
    }

    @Override
    public void drive() {
        System.out.println("Employee driving car");
        cars.drive();
    }
}
