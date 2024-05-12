package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.AbstractFactory.WithoutPattern;

public class MsiManufacturer extends Company{
    @Override
    public Component createComponent(String type) {
        Component component = null;
        if(type.equalsIgnoreCase("GPU")){
            component = new  MsiGPU();
        }else if(type.equalsIgnoreCase("Monitor")){
            component = new MsiMonitor();
        }
        return component;
    }
}
