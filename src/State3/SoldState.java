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
public class SoldState implements State{
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter(){
        System.out.println("Please wait, we're alreeady giving you a quarter");
    }
    
    @Override
    public void ejectQuarter(){
        System.out.println("Sorry,you already turned the crank");
        
    }
    
    @Override
    public void turnCrnk() {
        System.out.println("Turning twice doesn't get you another gumball!");
        
       
    }
    
    @Override
    public void dispense(){
        gumballMachine.releaseBall();
        if (gumballMachine.getCount()>0){
         gumballMachine.setState(gumballMachine.getWinnerState());    
        }else{
                System.out.println("Oops, out of gumballs!");
             gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    System.out.println("You need to pay first");    
    } 
    @Override
    public void refill(){}

    @Override
    public String toString(){
        return "displensing quarter";
    
}

    

}


