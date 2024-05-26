package org.Vinayak.DesignPattern.BehaviouralDesignPattern.ChainOfResponsibility;

public class DebugProcessor extends LogProcessor{

    DebugProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG : "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
