package org.Vinayak.DesignPattern.StructuralDesignPattern.FlyWeight.WithPattern;


public class ApprovedStamp extends Stamp {

    private String colour;
    private String toPrint;

    ApprovedStamp(String colour, String toPrint){
        this.colour = colour;
        this.toPrint = toPrint;
    }
}
