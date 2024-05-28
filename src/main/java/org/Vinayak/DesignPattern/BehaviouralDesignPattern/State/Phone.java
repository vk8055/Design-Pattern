package org.Vinayak.DesignPattern.BehaviouralDesignPattern.State;

public class Phone {

    private State state;

    public Phone(){
        state = new OffState(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public String lock(){
        return "Locking phone";
    }

    public String home(){
        return "Going to home screen";
    }

    public String unlock(){
        return "Unlocking the phone";
    }

    public String turnOn(){
        return "Turning on screen , device still locked";
    }
}
