/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State3;


/**
 *
 * @author user
 */
public class NoGuarterState implements State{
    GumballMachine gumballMachine;
    
    public NoGuarterState (GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState (gumballMachine.getHasQuarterState());

    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not inserted a quarter");

    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there is no quarter");

    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() {
    }
     @Override
    public String toString() {
        return "waiting for quarter";
    }
    
}
