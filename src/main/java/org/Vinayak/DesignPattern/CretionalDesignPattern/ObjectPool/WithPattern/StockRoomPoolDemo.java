package org.Vinayak.DesignPattern.CretionalDesignPattern.ObjectPool.WithPattern;

public class StockRoomPoolDemo {

    ObjectPool<StockRoom> pool;

    private void setUp(int size){
        pool = new StockRoomPool(size);
    }

    private int getSize(){
      return pool.size();
    }

    private void printInstanceId(StockRoom stockRoom){
        System.out.println(stockRoom.getInstanceId());
    }

    public static void main(String[] args){

        StockRoomPoolDemo stockRoomPoolDemo = new StockRoomPoolDemo();
        stockRoomPoolDemo.setUp(5);
        stockRoomPoolDemo.getSize();

        StockRoom stockRoomOne = stockRoomPoolDemo.pool.borrowObject();
        System.out.println(stockRoomOne.getInstanceId());
        System.out.println(stockRoomPoolDemo.pool.size());
        stockRoomPoolDemo.pool.returnObject(stockRoomOne);
        System.out.println(stockRoomPoolDemo.pool.size());
        StockRoom stockRoomTwo =stockRoomPoolDemo.pool.borrowObject();
        System.out.println(stockRoomTwo.getInstanceId());
        System.out.println(stockRoomPoolDemo.pool.size());
    }

}


