package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.AbstractFactory.WithoutPattern;

public class AsusManufacturer extends Company{

    @Override
    public Component createComponent(String type) {
        Component component = null;
        if(type.equalsIgnoreCase("GPU")){
            component = new AsusGPU();
        }else if(type.equalsIgnoreCase("Monitor")){
            component = new AsusMonitor();
        }
        return component;
    }
}
