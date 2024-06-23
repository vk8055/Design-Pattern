package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Command;

public class AddCommand implements Command{

    private Calculator calculator;
    private int operand;

    public AddCommand(Calculator calculator, int operand) {
        this.calculator = calculator;
        this.operand = operand;
    }


    @Override
    public void execute() {
        calculator.add(operand);
    }

    @Override
    public void undo() {
        calculator.subtract(operand);
    }
}
