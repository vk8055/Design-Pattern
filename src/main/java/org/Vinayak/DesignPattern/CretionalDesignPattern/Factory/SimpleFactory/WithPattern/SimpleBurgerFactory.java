package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.SimpleFactory.WithPattern;

public class SimpleBurgerFactory {

    public Burger createBurger(String orderRequest){
        if(orderRequest.equalsIgnoreCase("Veggie")){
            return new VeggieBurger().prepare();
        }else if(orderRequest.equalsIgnoreCase("Cheese")){
            return new CheeseBurger().prepare();
        }
        return null;
    }
}
