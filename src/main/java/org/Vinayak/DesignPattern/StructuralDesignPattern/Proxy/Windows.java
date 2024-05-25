package org.Vinayak.DesignPattern.StructuralDesignPattern.Proxy;

public class Windows implements BootProcess{
    @Override
    public void powerOnSelfTest() {
        //Hardware initialization and testing.
        System.out.println("Hardware initialized and testing.");
    }

    @Override
    public void bootLoader() {
       //BIOS/UEFI locates the bootable device and loads the boot loader.
        System.out.println("Boot loader initialized");
    }

    @Override
    public void bootManager() {
      // Loads and executes the Windows Boot Loader (WINLOAD.EXE).
        System.out.println("WINLOAD.EXE executed");
    }

    @Override
    public void winLoad() {
     //Loads the Windows kernel, HAL, and essential drivers.
        System.out.println("Windows kernel loaded");
    }

    @Override
    public void kernelInitialization() {
     //Initializes core system processes and drivers.
        System.out.println("Drivers initialized");
    }

    @Override
    public void logOnPhase() {
      //Starts user authentication and system services.
        System.out.println("System services started");
    }

    @Override
    public void userLogOn() {
      //The user logs in, and the desktop environment is set up.
        System.out.println("Welcome to Windows");
    }
}
