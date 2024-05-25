package org.Vinayak.DesignPattern.StructuralDesignPattern.Proxy;

import java.util.Objects;

public class WindowsProxy implements Start{

    private Windows windows;
    private String password = "WINDOWS";

    @Override
    public void startWindows() {

        if(Objects.isNull(windows)){
            windows = new Windows();
        }

        powerOnSelfTest();
        bootLoader();
        bootManager();
        winLoad();
        kernelInitialization();
        logOnPhase();
    }

    @Override
    public boolean authorizeUser(String userPassword) {
        if(password.equalsIgnoreCase(userPassword)){
            userLogOn();
            return true;
        }
        return false;
    }

    @Override
    public void powerOnSelfTest() {
        windows.powerOnSelfTest();
    }

    @Override
    public void bootLoader() {
        windows.bootLoader();
    }

    @Override
    public void bootManager() {
        windows.bootManager();
    }

    @Override
    public void winLoad() {
        windows.winLoad();
    }

    @Override
    public void kernelInitialization() {
        windows.kernelInitialization();
    }

    @Override
    public void logOnPhase() {
        windows.logOnPhase();
    }

    @Override
    public void userLogOn() {
        windows.userLogOn();
    }

}
