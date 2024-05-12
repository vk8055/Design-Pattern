package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.AbstractFactory.WithPatternn;

public class MsiManufacturer extends Company {

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

    @Override
    public GPU createGPU() {
        return new MsiGPU();
    }
}
