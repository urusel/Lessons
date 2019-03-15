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
public class NoQuarterState implements State{
    GumballMachine gumballMachine;
    
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
     @Override
    public void insertQuarter(){
        System.out.println("You  inserted a quarter");
    }
    
    @Override
    public void ejectQuarter(){
        System.out.println("You haven't insert a quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    @Override
    public void turnCrnk() {
        System.out.println("You turned, but there's no quarter");
        
       
    }
    
    public void dispense() {
    System.out.println("You need to pay first");    
    } 
    @Override
    public void refill(){ }

    @Override
    public String toString(){
        return "waiting for turn of crank";
    }

    

}


    
