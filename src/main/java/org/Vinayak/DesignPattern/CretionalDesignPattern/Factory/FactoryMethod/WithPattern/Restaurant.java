package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.FactoryMethod.WithPattern;


public abstract class Restaurant {

    public Burger orderBurger(){
        return createBurger();
    }

    abstract Burger createBurger();
}
