package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Mediator;

public class Main {


    public static void main(String[] args){
        AuctionMediator auctionMediator = new Auction();

        Colleague bidder1 = new Bidder("Lalit",auctionMediator);
        Colleague bidder2 = new Bidder("Vinayak",auctionMediator);

        bidder1.placeBid(450000);
        bidder2.placeBid(470000);
        bidder1.placeBid(480000);
        bidder2.placeBid(500000);

    }
}
