package org.Vinayak.DesignPattern.CretionalDesignPattern.Prototype.WithPattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Address address = new Address("BalPur","560921");
        Person personOne = new Person("Vinayak","123456789",address);
        Person personTwo = personOne.clone();
        System.out.println(personOne);
        System.out.println(personTwo);
    }
}
