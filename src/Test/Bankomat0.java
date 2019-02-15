/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author user
 */
public class Bankomat0 {
    static int money = 100;
    static void getMoney(int amount){
        if(amount<=money){
            money-=amount;
            System.out.println("Congrat! new amount:" + money);
        }else{
            System.out.println("Not enough money!");
        }
    }
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Vasya: ");
            Bankomat0.getMoney(50);
        }).start();
        new Thread(() ->{
      System.out.println("Petya: ");
            Bankomat0.getMoney(50); 
              
    }).start();
   
    new Thread(() ->{
      System.out.println("Gavrilla: ");
            Bankomat0.getMoney(50); 
              
    }).start();
}
}
