package org.Vinayak.DesignPattern.BehaviouralDesignPattern.ChainOfResponsibility;

public class InfoProcessor extends LogProcessor{

    InfoProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel == INFO){
            System.out.println("INFO : "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
