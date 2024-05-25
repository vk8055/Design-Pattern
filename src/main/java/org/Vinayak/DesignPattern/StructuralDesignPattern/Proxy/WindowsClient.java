package org.Vinayak.DesignPattern.StructuralDesignPattern.Proxy;

public class WindowsClient {

    public static void main(String[] args){

        Start start = new WindowsProxy();
        start.startWindows();
        start.authorizeUser("WINDOWS");

    }

}
