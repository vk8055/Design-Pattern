package org.Vinayak.DesignPattern.CretionalDesignPattern.Prototype.WithPattern;

public class Address {

    private String city;
    private String pinCode;

    public Address(String city,String pinCode){
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode='" + pinCode + '\'' +
                '}';
    }
}
