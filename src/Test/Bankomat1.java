/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Bankomat1 {
    static int money = 100;
    static void getMoney(int amount) {
        if(amount<=money){
            try{
                Thread.sleep(1000);
                
            }catch(InterruptedException ex){
                Logger.getLogger(Bankomat1.class.getName()).log(Level.SEVERE, null,ex);
            }
            money-=amount;
            System.out.println("Congrat! new amount:" + money);
                   
        }else{
            System.out.println("Not enough money!");
        }
    }
    public static void main(String[] args) {
        new Thread(()->{
             System.out.println("Vasya: ");
            Bankomat1.getMoney(50);
        }).start();
        new Thread(() ->{
      System.out.println("Petya: ");
            Bankomat1.getMoney(50); 
              
    }).start();
   
    new Thread(() ->{
      System.out.println("Gavrilla: ");
            Bankomat1.getMoney(50); 
              
    }).start();
     new Thread(() ->{
      System.out.println("Lola: ");
            Bankomat1.getMoney(50); 
              
    }).start();
}
}
        
   

