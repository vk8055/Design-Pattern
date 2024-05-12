package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.FactoryMethod.WithPattern;

public abstract class Burger {

     private int productId;

     private String addOns;

     protected abstract Burger prepare();
}
