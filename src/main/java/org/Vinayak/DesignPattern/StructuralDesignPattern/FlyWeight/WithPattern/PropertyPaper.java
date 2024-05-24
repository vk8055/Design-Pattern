package org.Vinayak.DesignPattern.StructuralDesignPattern.FlyWeight.WithPattern;

public class PropertyPaper implements IProperty {
    private String propertyName;
    private String owner;
    private boolean approved;

    PropertyPaper(String propertyName, String owner){
        this.propertyName = propertyName;
        this.owner = owner;
    }

    @Override
    public void stampPropertyPaper(Stamp stamp) {
        if(stamp instanceof ApprovedStamp){
            approved = true;
        }
    }
}
