/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite2;

/**
 *
 * @author user
 */
public class Waitress {
   MenuComponent allMenus; 
   public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }
    public void printMenu(){
      allMenus.print();
    }
}
