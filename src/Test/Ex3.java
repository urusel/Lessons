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
public class Ex3 {
    static class Recipe implements Runnable{
        @Override
        public void run(){
            try{
                Thread.sleep(2000);
                
            }catch (InterruptedException ex){
                Logger.getLogger( Ex3.class.getName()).log(Level.SEVERE,null,ex);
            }
            System.err.println("...готовим по рецепту ...");
        }
        
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new Ex2.Recipe());
        thread.start();
        
        thread.setName("Cook");
         System.err.println(thread.getName());
          System.err.println(Thread.currentThread().getName());
    }
}
