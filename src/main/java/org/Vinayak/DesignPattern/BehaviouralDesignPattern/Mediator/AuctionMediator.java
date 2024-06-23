package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Mediator;

public interface AuctionMediator {

    void addBidder(Colleague colleague);
    void placeBid(Colleague bidder,int amount);
}
