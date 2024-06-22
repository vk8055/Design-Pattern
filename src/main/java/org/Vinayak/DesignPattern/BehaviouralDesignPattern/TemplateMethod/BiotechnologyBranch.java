package org.Vinayak.DesignPattern.BehaviouralDesignPattern.TemplateMethod;

public class BiotechnologyBranch extends AdmissionProcess{
    @Override
    public void AdmissionForm() {
        System.out.println("Require math marks");
    }

    @Override
    public void DocumentVerification() {
        System.out.println("Require 10,12th mark sheet");
    }

    @Override
    public void PayFees() {
        System.out.println("60k");
    }

    @Override
    public void HostelAllotment() {
        System.out.println("Hostel A");
    }
}
