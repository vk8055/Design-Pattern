package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.FactoryMethod.WithPattern;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    Burger createBurger() {
        return new VeggieBurger().prepare();
    }
}
