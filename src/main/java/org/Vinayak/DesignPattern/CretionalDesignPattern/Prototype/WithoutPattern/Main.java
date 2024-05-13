package org.Vinayak.DesignPattern.CretionalDesignPattern.Prototype.WithoutPattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Address address = new Address("BalPur","560921");
        Person personOne = new Person("Vinayak","123456789",address);

        Person personTwo = new Person();
        personTwo.setName(personOne.getName());
        personTwo.setPhoneNo(personOne.getPhoneNo());
        personTwo.setAddress(personOne.getAddress());

        System.out.println(personOne);
        System.out.println(personTwo);
    }
}
