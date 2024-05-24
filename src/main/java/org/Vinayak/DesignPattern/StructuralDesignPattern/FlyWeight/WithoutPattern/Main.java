package org.Vinayak.DesignPattern.StructuralDesignPattern.FlyWeight.WithoutPattern;

public class Main {

    /*
    With intrinsic and extrinsic data to stamp the property paper we need to create stamp
    every time.
    Fly Weight resolves these problem.
    Fly weight pattern removes extrinsic data, and cached it to reuse it.
    */

    PropertyPaper paper1 = new PropertyPaper("BUNGLOW","VIVEK",new ApprovedStamp("BLUE","APPROVED"));
    PropertyPaper paper2 = new PropertyPaper("CAR","GAURAV",new UnApprovedStamp("RED","UNAPPROVED"));
    PropertyPaper paper3 = new PropertyPaper("BIKE","MAYUR",new ApprovedStamp("BLUE","APPROVED"));
    PropertyPaper paper4 = new PropertyPaper("GOLD","VINAYAK",new UnApprovedStamp("RED","UNAPPROVED"));
    PropertyPaper paper5 = new PropertyPaper("FARM","LALIT",new ApprovedStamp("BLUE","APPROVED"));
    PropertyPaper paper6 = new PropertyPaper("PLOT","DEVA",new ApprovedStamp("BLUE","APPROVED"));
    PropertyPaper paper7 = new PropertyPaper("SILVER","NARENDRA",new UnApprovedStamp("BLUE","APPROVED"));
    PropertyPaper paper8 = new PropertyPaper("DIAMOND","TUSHAR",new ApprovedStamp("RED","UNAPPROVED"));
    PropertyPaper paper9 = new PropertyPaper("JET","JAYESH",new ApprovedStamp("BLUE","APPROVED"));


}
