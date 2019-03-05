/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template3;



/**
 *
 * @author user
 */
public class Barista {
    public static void main(String[] args) {
        Drink tea = new 
   Tea();
        Drink coffe = new 
        Coffe();
        
        System.out.println("Making tea...");
          System.out.println("================");
          
        tea.prepareRecipe();
        
        System.out.println("Making coffeee...");
          System.out.println("===========");
          
        coffe.prepareRecipe();
    }
}
