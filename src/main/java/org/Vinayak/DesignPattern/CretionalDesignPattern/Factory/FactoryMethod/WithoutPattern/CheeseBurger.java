package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.FactoryMethod.WithoutPattern;

public class CheeseBurger extends Burger {

    String cheese;

    CheeseBurger(){

    }

    CheeseBurger(String cheese){
        this.cheese = cheese;
    }

    @Override
    protected Burger prepare() {
        return new CheeseBurger("Brie");
    }
}
