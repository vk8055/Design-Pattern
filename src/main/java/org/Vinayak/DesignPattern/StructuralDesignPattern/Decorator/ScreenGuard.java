package org.Vinayak.DesignPattern.StructuralDesignPattern.Decorator;

public class ScreenGuard extends MobileDecorator{

    Mobile mobile;
    int cost = 200;

    public ScreenGuard(Mobile mobile){
        this.mobile = mobile;
    }

    @Override
    void add() {
        System.out.println("Adding ScreenGuard to Mobile.");
    }

    @Override
    int getCost() {
        add();
        return mobile.getCost() + cost;
    }
}
