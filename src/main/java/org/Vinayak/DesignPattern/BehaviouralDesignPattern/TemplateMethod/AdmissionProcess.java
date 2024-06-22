package org.Vinayak.DesignPattern.BehaviouralDesignPattern.TemplateMethod;

public abstract class AdmissionProcess {

    public abstract void AdmissionForm();
    public abstract void DocumentVerification();
    public abstract void PayFees();
    public abstract void HostelAllotment();

    public final  void AdmissionProcess(){
        AdmissionForm();
        DocumentVerification();
        PayFees();
        HostelAllotment();
    }

}
