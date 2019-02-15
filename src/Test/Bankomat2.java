/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author user
 */
public class Bankomat2 {
    static int money = 100;
    
    synchronized static void getMoney(int amount){
        if(amount<=money){
            try {
                Thread.sleep(1000);
                
                money-=amount;
                System.out.println("Congrat! new amount:" + money);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Bankomat2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.err.println("Not enough money!");
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
        