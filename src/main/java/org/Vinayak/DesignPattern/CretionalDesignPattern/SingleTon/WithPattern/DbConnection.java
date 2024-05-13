package org.Vinayak.DesignPattern.CretionalDesignPattern.SingleTon.WithPattern;

public class DbConnection {

    private static volatile DbConnection dbConnection;

    /*
    Volatile keyword added so that if partial instance is created by any thread and added in thread memory,
    other thread will consider that instance is not created yet, so it might start process to create new instance.
    volatile push results in memory so that, these problem can be avoided.
    */

    private String dbConnectionUrl = "localhost";
    private int portNo = 3306;
    private String zone = "local";

    private DbConnection() {
        if(dbConnection != null){
            throw new RuntimeException("Security violation");
        }
    }

    public static DbConnection getInstance(){
        DbConnection result = dbConnection;  // to avoid fetching of dbconnection reference from memory again n again , it will improve performance.
        if(result == null){     // to check if instance already created, have added check before synchronized , so that thread don't need to wait if instance already created.
            synchronized (DbConnection.class){  // to wait thread, so that multi thread cannot create another instance.
                result = dbConnection;
                if(result == null){
                    result = dbConnection = new DbConnection();
                }
            }
        }
        return dbConnection;
    }


    public String getDbConnectionUrl() {
        return dbConnectionUrl;
    }

    public int getPortNo() {
        return portNo;
    }

    public String getZone() {
        return zone;
    }
}
