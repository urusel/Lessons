/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone1;

import Singletone0.SingLetone;

/**
 *
 * @author user
 */
public class Boller1 {
     private boolean empty;
    private boolean boiled;
    
    public static Boller1 uniqueInLetone;
        
    private Boller1(){
        empty = true;
        boiled = false;
    }
    

    public static  Boller1 getInstance(){
        if(uniqueInLetone == null){
         uniqueInLetone = new Boller1();
            System.out.println("The new instance of boiler1");
        }
          System.out.println("Returning instance ...");   
          return uniqueInLetone;
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