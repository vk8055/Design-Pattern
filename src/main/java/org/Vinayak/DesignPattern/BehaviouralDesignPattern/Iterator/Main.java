package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Iterator;

import java.awt.color.CMMException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Vinayak"),
                new Employee(2,"Vivek"),
                new Employee(3,"Gaurav"),
                new Employee(4,"Mayur"),
                new Employee(5,"Lalit")
        );


        Company company = new Company(employeeList);
        Iterator iterator = company.createIterator();

        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            System.out.println(employee.getEmployeeName());
        }





    }
}
