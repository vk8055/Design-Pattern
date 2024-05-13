package org.Vinayak.DesignPattern.CretionalDesignPattern.SingleTon.WithoutPattern;

public class Main {
    public static void main(String[] args){

        // if i want to update any table in my database , i will need to connect db.
        // I will create connection with db. For that i have one connection class.
        // I will need to initialize it.
        DbConnection dbConnection = new DbConnection();
        System.out.println(dbConnection.getDbConnectionUrl());


        //For any other operation again i will need to connect db.
        //Again i will need to instantiate connection class.

        DbConnection dbConnection1 = new DbConnection();
        System.out.println(dbConnection.getDbConnectionUrl());

        /* As we can see values of the class are going to be same always.
        In these case singleton comes in picture,
        classes which are use frequently and have same set of data,
        that should not be get instantiated again and again,
        instead they should get instantiated only once.
        */
    }
}
