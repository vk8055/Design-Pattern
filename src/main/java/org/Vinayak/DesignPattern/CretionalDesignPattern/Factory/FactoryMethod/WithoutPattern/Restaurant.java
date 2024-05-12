package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.FactoryMethod.WithoutPattern;

public class Restaurant {

    public Burger orderBurger(String orderRequest){
        if(orderRequest.equalsIgnoreCase("Veggie")){
            return new VeggieBurger().prepare();
        }else if(orderRequest.equalsIgnoreCase("Cheese")){
            return new CheeseBurger().prepare();
        }
        return null;
    }
}
