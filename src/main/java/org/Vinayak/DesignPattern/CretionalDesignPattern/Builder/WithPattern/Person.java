package org.Vinayak.DesignPattern.CretionalDesignPattern.Builder.WithPattern;

public class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final String address;
    private final String phoneNumber;
    private final String email;

    // Private constructor to prevent direct instantiation
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    // Builder class
    public static class Builder {
        // Required parameters
        private String name;
        private int age;

        // Optional parameters - initialized with default values
        private String gender = "Unknown";
        private String address = "Unknown";
        private String phoneNumber = "Unknown";
        private String email = "Unknown";

        // Builder constructor with required parameters
        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Setter methods for optional parameters
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        // Build method to create the Person object
        public Person build() {
            return new Person(this);
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
