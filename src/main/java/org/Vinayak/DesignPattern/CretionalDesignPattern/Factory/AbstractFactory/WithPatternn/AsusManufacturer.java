package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.AbstractFactory.WithPatternn;


public class AsusManufacturer extends Company {
    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public GPU createGPU() {
        return new AsusGPU();
    }
}
