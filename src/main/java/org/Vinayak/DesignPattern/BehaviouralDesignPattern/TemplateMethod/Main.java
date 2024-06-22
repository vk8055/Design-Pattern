package org.Vinayak.DesignPattern.BehaviouralDesignPattern.TemplateMethod;

public class Main {

    public static void main(String[] args){

        BiotechnologyBranch biotechnologyBranch = new BiotechnologyBranch();
        biotechnologyBranch.AdmissionProcess();

        ComputerBranch computerBranch  = new ComputerBranch();
        computerBranch.AdmissionProcess();

        MechanicalBranch mechanicalBranch = new MechanicalBranch();
        mechanicalBranch.AdmissionProcess();

    }
}
