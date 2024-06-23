package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Mediator;

public interface Colleague {

    void placeBid(int amount);
    void receiveNotification(String name,int bidAmount);
    String getName();
}
