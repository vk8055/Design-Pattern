package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Command;

public class DivideCommand implements Command{

    private Calculator calculator;
    private int operand;

    DivideCommand(Calculator calculator,int operand){
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.divide(operand);
    }

    @Override
    public void undo() {
        calculator.multiply(operand);
    }
}
