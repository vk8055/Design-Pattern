package org.Vinayak.DesignPattern.StructuralDesignPattern.FlyWeight.WithoutPattern;

public class PropertyPaper {

    private String propertyName;   // intrinsic
    private String owner;          // intrinsic
    private Stamp stamp;   // extrinsic

    PropertyPaper(String propertyName, String owner, Stamp stamp){
        this.propertyName = propertyName;
        this.owner = owner;
        this.stamp = stamp;
    }
}
