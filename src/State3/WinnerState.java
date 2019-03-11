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
public class WinnerState implements State{
    GumballMachinegu gumballMachinegu;
    
    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachinegu = gumballMachine;
    }
    
     @Override
    public void insertQuarter(){
        System.out.println("Please wait,we're already giving you a Gumball");
    }
    
    @Override
    public void ejectQuarter(){
        System.out.println("Please wait,we're already giving you a Gumball");
       
    }
    
    @Override
    public void turnCrank(){
        System.out.println("Turning again does't get you another gumball");
        
       
    }
    
    @Override
    public void dispense(){
    System.out.println("You need to pay first");    
    } 
    @Override
    public void refill(){}
}
    @Override
    publicSt String toString(){
        return "waiting for turn for quarter";
    }
}

    
}
