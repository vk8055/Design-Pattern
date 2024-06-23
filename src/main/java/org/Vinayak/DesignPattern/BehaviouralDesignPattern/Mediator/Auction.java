package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague colleague) {
            colleagues.add(colleague);
    }

    @Override
    public void placeBid(Colleague bidder, int amount) {

        for(Colleague colleague : colleagues){
            if(!colleague.getName().equalsIgnoreCase(bidder.getName())){
                colleague.receiveNotification(bidder.getName(),amount);
            }
        }
    }
}
