package org.Vinayak.DesignPattern.StructuralDesignPattern.FlyWeight.WithPattern;

public class UnApprovedStamp extends Stamp {
    private String colour;
    private String toPrint;

    UnApprovedStamp(String colour, String toPrint){
        this.colour = colour;
        this.toPrint = toPrint;
    }
}
