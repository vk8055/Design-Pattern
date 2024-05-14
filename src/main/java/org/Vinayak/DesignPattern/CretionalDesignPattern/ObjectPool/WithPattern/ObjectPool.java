package org.Vinayak.DesignPattern.CretionalDesignPattern.ObjectPool.WithPattern;

import java.util.concurrent.ConcurrentLinkedDeque;

public abstract class ObjectPool<T> {

    private final ConcurrentLinkedDeque<T> pool;


    public ObjectPool(int size){
        pool = new ConcurrentLinkedDeque<>();
        initialize(size);
    }

    private void initialize(int size){
        for(int i = 0 ; i< size;i++){
            pool.add(create());
        }
    }

    public abstract T create();

    public T borrowObject(){
        T object  = pool.poll();
        if(object == null){
            object = create();
        }
        return object;
    }

    public void returnObject(T object){
        if(object == null){
            return;
        }
        pool.offer(object);
    }

    public int size(){
        return pool.size();
    }

}
