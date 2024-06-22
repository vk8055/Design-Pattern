package org.Vinayak.DesignPattern.BehaviouralDesignPattern.TemplateMethod;

public class MechanicalBranch extends AdmissionProcess{
    @Override
    public void AdmissionForm() {
        System.out.println("Require physics and chemistry marks");
    }

    @Override
    public void DocumentVerification() {
        System.out.println("Require 12th mark sheet");
    }

    @Override
    public void PayFees() {
        System.out.println("65k");
    }

    @Override
    public void HostelAllotment() {
        System.out.println("Hostel C");
    }
}
