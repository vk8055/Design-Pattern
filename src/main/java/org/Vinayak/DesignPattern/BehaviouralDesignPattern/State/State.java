package org.Vinayak.DesignPattern.BehaviouralDesignPattern.State;

public abstract class State {

    protected Phone phone;

    public State(Phone phone){
        this.phone = phone;
    }

    public abstract String onHome();
    public abstract String onOffon();
}
