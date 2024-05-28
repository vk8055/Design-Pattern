package org.Vinayak.DesignPattern.BehaviouralDesignPattern.State;

public class Main {

    public static void main(String[] args){

        Phone phone = new Phone();
        System.out.println(phone.getState().onHome());
        System.out.println(phone.getState().onOffon());
        System.out.println(phone.getState().onHome());
        System.out.println(phone.getState().onHome());
        System.out.println(phone.getState().onOffon());

    }
}
