package org.Vinayak.DesignPattern.CretionalDesignPattern.ObjectPool.WithPattern;

public class StockRoomPool extends ObjectPool<StockRoom>{

    int stockNumber = 1234;

    public StockRoomPool(int size){
        super(size);
    }

    @Override
    public StockRoom create() {
        StockRoom stockRoom = new StockRoom(stockNumber);
        System.out.println("Creating instance with instance id : "+ stockRoom.getInstanceId());
        return stockRoom;
    }
}
