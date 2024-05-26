package org.Vinayak.DesignPattern.BehaviouralDesignPattern.Iterator;

import java.util.List;

public class EmployeeIterator implements Iterator{

    private List<Employee> employeeList;
    private int index = 0;

    public EmployeeIterator(List<Employee> employeeList){
        this.employeeList = employeeList;
    }

    @Override
    public boolean hasNext() {
        return index < employeeList.size();
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return employeeList.get(index++);
        }

        return null;
    }
}
