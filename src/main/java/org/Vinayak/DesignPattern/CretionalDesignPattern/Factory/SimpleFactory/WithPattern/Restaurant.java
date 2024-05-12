package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.SimpleFactory.WithPattern;


public class Restaurant {

    public Burger orderBurger(String request){
        SimpleBurgerFactory simpleBurgerFactory = new SimpleBurgerFactory();
        Burger burger = simpleBurgerFactory.createBurger(request);
        burger.prepare();
        return burger;
    }

}
