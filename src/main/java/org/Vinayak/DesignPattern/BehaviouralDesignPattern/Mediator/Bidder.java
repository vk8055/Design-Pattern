package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Mediator;

public class Bidder implements Colleague{

    private String name;
    private AuctionMediator auctionMediator;

    Bidder(String name,AuctionMediator auctionMediator){
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount) {
            auctionMediator.placeBid(this,amount);
    }

    @Override
    public void receiveNotification(String name,int bidAmount) {
        System.out.println(name + " bid amount of  : " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
