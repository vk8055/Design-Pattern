package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Iterator;

import java.util.List;

public class Company implements Aggregator{

    private List<Employee> employeeList;

    public Company(List<Employee> employeeList){
        this.employeeList = employeeList;
    }

    @Override
    public Iterator createIterator() {
        return new EmployeeIterator(employeeList);
    }
}
