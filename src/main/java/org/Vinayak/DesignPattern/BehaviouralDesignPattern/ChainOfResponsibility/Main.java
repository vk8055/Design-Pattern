package org.Vinayak.DesignPattern.BehaviouralDesignPattern.ChainOfResponsibility;

import sun.rmi.runtime.Log;

public class Main {

    public static void main(String[] args){

        LogProcessor logProcessor = new DebugProcessor(new InfoProcessor(new ErrorProcessor(null)));

        logProcessor.log(LogProcessor.DEBUG,"Debugging line 11");
        logProcessor.log(LogProcessor.ERROR,"Error at line 12");
        logProcessor.log(LogProcessor.INFO,"Info at line 13");

    }
}
