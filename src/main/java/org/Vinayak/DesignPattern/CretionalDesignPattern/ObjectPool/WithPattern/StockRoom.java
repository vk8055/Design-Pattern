package org.Vinayak.DesignPattern.CretionalDesignPattern.ObjectPool.WithPattern;

public class StockRoom {

    private final int stockNumber;

    private int instanceId = this.hashCode();

    public StockRoom(int stockNumber){
        this.stockNumber = stockNumber;
    }

    public int getStockNumber(){
        return stockNumber;
    }

    public int getInstanceId(){
        return instanceId;
    }
}
