package org.Vinayak.DesignPattern.BehaviouralDesignPattern.State;

public class ReadyState extends State{

    public ReadyState(Phone phone){
        super(phone);
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOffon() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
