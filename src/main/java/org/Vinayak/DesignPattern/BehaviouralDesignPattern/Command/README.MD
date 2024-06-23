Problem Statement :

Say we have calculator app, in that we have to functionality like add and subtract.
So server side code may look like

    Calculator{
       private int result = 0;
       
        add(int value){
            //logic of addition,
            result += value;
            }
    

        subtract(int value){
            //logic of subtraction
            result -= value;
            }
    }

    Client{
        
        Calculator calculator = new Calculator():
        calculator.add(5);
        calculator.subtract(1);
    }

These code looks simple and easy to handle.
But what if i want to add undo functionality in it.
I will need to change calculator class and client code as well.

Here comes command design pattern.


Command Design Pattern separates the logic of :

- Receiver
- Invoker
- Command

In the example 
Receiver is Calculator Class.
Invoker is Calculator Invoker.
Command is an interface and Concrete classes has functionality implementation.