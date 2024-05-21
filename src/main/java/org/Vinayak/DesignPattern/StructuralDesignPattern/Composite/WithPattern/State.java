package org.Vinayak.DesignPattern.StructuralDesignPattern.Composite.WithPattern;

import java.util.ArrayList;
import java.util.List;

public class State implements People {

    String name;
    List<People> statePeople;

    State(String name){
        this.name = name;
        statePeople = new ArrayList<>();
    }

    public void add(People person){
        statePeople.add(person);
    }

    @Override
    public int validateAndCountAdharCard() {
        System.out.println("State Name : "+name);
        int count = 0;
        for(People person : statePeople){
            count += person.validateAndCountAdharCard();
        }
        return count;
    }
}
