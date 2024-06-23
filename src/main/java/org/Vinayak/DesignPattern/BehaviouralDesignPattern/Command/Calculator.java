package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Command;

public class Calculator {

    private int result = 0;

    public void add(int value){
        result += value;
        System.out.println("Result after adding " + value + " : " + result);
    }

    public void subtract(int value){
        result -= value;
        System.out.println("Result after subtracting " + value + " : " + result);
    }

    public void multiply(int value){
        result *= value;
        System.out.println("Result after multiplying " + value + " : " + result);
    }

    public void divide(int value){
        if (value != 0) {
            result /= value;
            System.out.println("Result after dividing by " + value + ": " + result);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public int getResult(){
        return result;
    }


}
