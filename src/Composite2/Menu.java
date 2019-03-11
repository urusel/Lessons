/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Menu extends MenuComponent {

    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
   String name;
    String description;
    
    public Menu(String name,
                     String description)
    {
        this.name=name;
        this.description= description;
        
    }
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        
    }
     public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
     }
public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void print(){
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
          MenuComponent menuComponent  =
                  (MenuComponent)iterator.next();
          menuComponent.print();
        }
        
}
    
}