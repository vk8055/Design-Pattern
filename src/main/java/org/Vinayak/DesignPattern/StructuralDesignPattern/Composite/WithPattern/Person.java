package org.Vinayak.DesignPattern.StructuralDesignPattern.Composite.WithPattern;

public class Person implements People {

    String name;
    boolean haveAdharCard = true;

    Person(String name, boolean haveAdharCard){
        this.name = name;
        this.haveAdharCard=haveAdharCard;
    }

    @Override
    public int validateAndCountAdharCard() {
        return haveAdharCard ? 1 : 0;
    }
}
