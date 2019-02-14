/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone1;

/**
 *
 * @author user
 */
public class Boiler0 {
     private boolean empty;
    private boolean boiled;
    
    public Boiler0(){
        empty = true;
        boiled = false;
        System.out.println("new Boiler created");;
    }
    public void fill(){
        
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("Boiler is filled");
        }
    }
    public void drain(){
        if (!isEmpty()&& isBoiled()){
            empty = true;
       System.out.println("Boiler is empty")  ;
       
        
    }
            
    }
    public void boil(){
      if (!isEmpty()&& isBoiled()){
            empty = true;
       System.out.println("boiling...")  ;  
    }
    
}
    public boolean isEmpty(){
        return boiled;
}
    public boolean isBoiled(){
        return boiled;
    }
    }
