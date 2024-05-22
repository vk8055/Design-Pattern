package org.Vinayak.DesignPattern.StructuralDesignPattern.Decorator;

public class BackCover extends MobileDecorator{

    Mobile mobile;
    int cost = 500;

    public BackCover(Mobile mobile){
        this.mobile = mobile;
    }

    @Override
    void add() {
        System.out.println("Adding BackCover to Mobile.");
    }

    @Override
    int getCost() {
        add();
        return mobile.getCost() + cost;
    }
}
