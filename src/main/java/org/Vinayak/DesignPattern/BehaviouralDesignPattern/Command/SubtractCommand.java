package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Command;

public class SubtractCommand implements Command{

    private Calculator calculator;
    private int operand;

    SubtractCommand(Calculator calculator,int operand){
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.subtract(operand);
    }

    @Override
    public void undo() {
        calculator.add(operand);
    }
}
