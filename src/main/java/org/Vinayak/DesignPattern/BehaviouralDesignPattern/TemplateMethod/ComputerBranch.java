package org.Vinayak.DesignPattern.BehaviouralDesignPattern.TemplateMethod;

public class ComputerBranch extends AdmissionProcess{
    @Override
    public void AdmissionForm() {
        System.out.println("Require math and physics marks");
    }

    @Override
    public void DocumentVerification() {
        System.out.println("Require course certificate,jee marks");
    }

    @Override
    public void PayFees() {
        System.out.println("70k");
    }

    @Override
    public void HostelAllotment() {
        System.out.println("Hostel B");
    }
}
