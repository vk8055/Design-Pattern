package org.Vinayak.DesignPattern.StructuralDesignPattern.Composite.WithPattern;

public class Main {

    public static void main(String[] args){


        People person1 = new Person("Vinayak",true);
        People person2 = new Person("Vivek",false);
        People person3 = new Person("Gaurav",true);
        People person4 = new Person("Mayur",false);
        People person5 = new Person("Lalit",true);
        People person6 = new Person("Yash",false);

        State maharashraState = new State("Maharashtra");

        maharashraState.add(person1);
        maharashraState.add(person2);
        maharashraState.add(person3);
        maharashraState.add(person4);
        maharashraState.add(person5);
        maharashraState.add(person6);

        System.out.println(maharashraState.validateAndCountAdharCard());
    }
}
