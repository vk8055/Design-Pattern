package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Command;

import java.util.Stack;

public class CalculatorInvoker {

    private Stack<Command> commandHistory = new Stack<>();

    public void executeCommand(Command command){
        command.execute();
        commandHistory.add(command);
    }

    public void undoCommand(){
        if(!commandHistory.isEmpty()){
            Command command = commandHistory.pop();
            command.undo();
        }
    }
}
