package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Command;

public class MultiplyCommand implements Command{

    private Calculator calculator;
    private int operand;

    MultiplyCommand(Calculator calculator,int operand){
        this.calculator = calculator;
        this.operand  = operand;
    }

    @Override
    public void execute() {
        calculator.multiply(operand);
    }

    @Override
    public void undo() {
        calculator.divide(operand);
    }
}
