package org.Vinayak.DesignPattern.CretionalDesignPattern.SingleTon.WithoutPattern;

public class DbConnection {

    private String dbConnectionUrl = "localhost";
    private int portNo = 3306;
    private String zone = "local";

    public DbConnection(){
    }

    public String getDbConnectionUrl() {
        return dbConnectionUrl;
    }

    public void setDbConnectionUrl(String dbConnectionUrl) {
        this.dbConnectionUrl = dbConnectionUrl;
    }

    public int getPortNo() {
        return portNo;
    }

    public void setPortNo(int portNo) {
        this.portNo = portNo;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
