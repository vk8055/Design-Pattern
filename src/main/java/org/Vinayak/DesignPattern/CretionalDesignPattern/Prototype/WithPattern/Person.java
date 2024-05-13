package org.Vinayak.DesignPattern.CretionalDesignPattern.Prototype.WithPattern;

public class Person implements Cloneable {

    private String name;
    private String phoneNo;
    private Address address;

    public Person(String name, String phoneNo, Address city) throws InterruptedException {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = city;
        Thread.sleep(5000);
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address=" + address +
                '}';
    }
}
