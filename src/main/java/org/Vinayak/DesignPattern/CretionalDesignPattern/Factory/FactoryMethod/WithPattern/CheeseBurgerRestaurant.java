package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.FactoryMethod.WithPattern;

public class CheeseBurgerRestaurant extends Restaurant{
    @Override
    Burger createBurger() {
        return new CheeseBurger().prepare();
    }
}
