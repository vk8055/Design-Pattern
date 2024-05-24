package org.Vinayak.DesignPattern.StructuralDesignPattern.FlyWeight.WithPattern;


public class Main {


    public static void main(String[] args){

        /*
        * After applying fly weight .
        * We have removed extrinsic data from PropertyPaper class(Stamp)
        * And Stamp we cached using StampFactory.
        * So same stamp will be reused instead of creating new one.
        * */


        Stamp approvedStamp = StampFactory.getStamp("APPROVED");
        Stamp unapprovedStamp = StampFactory.getStamp("UNAPROVED");

        PropertyPaper paper1 = new PropertyPaper("BUNGLOW","VIVEK");
        paper1.stampPropertyPaper(approvedStamp);
        PropertyPaper paper2 = new PropertyPaper("CAR","GAURAV");
        paper2.stampPropertyPaper(unapprovedStamp);
        PropertyPaper paper3 = new PropertyPaper("BIKE","MAYUR");
        paper3.stampPropertyPaper(unapprovedStamp);
        PropertyPaper paper4 = new PropertyPaper("GOLD","VINAYAK");
        paper4.stampPropertyPaper(approvedStamp);
        PropertyPaper paper5 = new PropertyPaper("FARM","LALIT");
        paper5.stampPropertyPaper(approvedStamp);
        PropertyPaper paper6 = new PropertyPaper("PLOT","DEVA");
        paper6.stampPropertyPaper(approvedStamp);
        PropertyPaper paper7 = new PropertyPaper("SILVER","NARENDRA");
        paper7.stampPropertyPaper(approvedStamp);
        PropertyPaper paper8 = new PropertyPaper("DIAMOND","TUSHAR");
        paper8.stampPropertyPaper(approvedStamp);
        PropertyPaper paper9 = new PropertyPaper("JET","JAYESH");
        paper9.stampPropertyPaper(approvedStamp);
    }
}
