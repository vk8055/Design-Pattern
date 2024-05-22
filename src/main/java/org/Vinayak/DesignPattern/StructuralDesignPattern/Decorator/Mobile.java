package org.Vinayak.DesignPattern.StructuralDesignPattern.Decorator;

public abstract  class Mobile {
    protected String battery;
    protected String screen;
    protected String speaker;
    protected String motherBoard;
    protected String camera;

    abstract int getCost();
}
