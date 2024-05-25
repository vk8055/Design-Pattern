package org.Vinayak.DesignPattern.StructuralDesignPattern.Proxy;

public interface Start extends BootProcess{

    void startWindows();
    boolean authorizeUser(String password);
}
