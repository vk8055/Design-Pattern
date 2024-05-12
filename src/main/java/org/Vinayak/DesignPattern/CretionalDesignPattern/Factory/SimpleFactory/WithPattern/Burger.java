package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.SimpleFactory.WithPattern;

public abstract class Burger {

     private int productId;

     private String addOns;

     protected abstract Burger prepare();
}
