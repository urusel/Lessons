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
public class WinnerState implements State {

    GumballMachine gumballMachinegu;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachinegu = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we're already giving you a Gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait,we're already giving you a Gumball");

    }

    @Override
    public void turnCrnk() {
        System.out.println("Turning again does't get you another gumball");

    }

    @Override
    public void dispense() {
        GumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSolOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
        }  
            if (gumballMachine.getCount() > 0) {
                GumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());

            }
        }
    

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }
}
