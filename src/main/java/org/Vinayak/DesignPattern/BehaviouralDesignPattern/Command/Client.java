package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Command;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorInvoker calculatorInvoker = new CalculatorInvoker();

        // Create commands
        Command addCommand = new AddCommand(calculator, 10);
        Command subtractCommand = new SubtractCommand(calculator, 5);
        Command multiplyCommand = new MultiplyCommand(calculator, 2);
        Command divideCommand = new DivideCommand(calculator, 2);

        // Execute commands
        calculatorInvoker.executeCommand(addCommand);      // Output: Result after adding 10: 10
        calculatorInvoker.executeCommand(subtractCommand); // Output: Result after subtracting 5: 5
        calculatorInvoker.executeCommand(multiplyCommand); // Output: Result after multiplying by 2: 10
        calculatorInvoker.executeCommand(divideCommand);   // Output: Result after dividing by 2: 5

        // Undo last command (Divide)
        calculatorInvoker.undoCommand();                   // Output: Result after multiplying by 2: 10
        // Undo previous command (Multiply)
        calculatorInvoker.undoCommand();                   // Output: Result after dividing by 2: 5
    }
}

