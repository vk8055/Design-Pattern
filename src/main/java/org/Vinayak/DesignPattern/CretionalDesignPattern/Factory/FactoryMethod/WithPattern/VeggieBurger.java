package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.FactoryMethod.WithPattern;

import java.util.Arrays;
import java.util.List;

public class VeggieBurger extends Burger {

    List<String> vegetables ;

    VeggieBurger(){

    }

    VeggieBurger(List<String> vegetables){
        this.vegetables = vegetables;
    }

    @Override
    protected Burger prepare() {
        return new VeggieBurger(Arrays.asList("Tomato","Capsicum","Potatoes"));
    }
}
