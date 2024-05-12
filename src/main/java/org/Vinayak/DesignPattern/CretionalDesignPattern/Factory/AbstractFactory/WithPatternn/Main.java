package org.Vinayak.DesignPattern.CretionalDesignPattern.Factory.AbstractFactory.WithPatternn;

public  class Main {

    public static void main(String[] args){

        Company msi = new MsiManufacturer();
        GPU msiGpu  = msi.createGPU();
        Monitor msiMonitor = msi.createMonitor();


        Company asus = new AsusManufacturer();
        GPU asusGpu  = msi.createGPU();
        Monitor asusMonitor = msi.createMonitor();

    }

}
