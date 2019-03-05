/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author user
 */
public class Coffe extends Drink {

    @Override
     void brew() {
        System.out.println("Завариваем кофе...");
    }

    @Override
     void addIngridients() {
        System.out.println("Добавляем молоко...");
    }
     @Override
     boolean customerWantsIngridients(){
         String answer = getUserInput();
         
         if(answer.toLowerCase().startsWith("y")){
             return true;
         }else
         {
             return false;
         }
     }
     private String getUserInput(){
         String answer = null;
       System.out.println("Хототе добавить молока? (y/n)"); 
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         try{
             answer=in.readLine();
         }catch(IOException ox){
         System.out.println("Error...");    
         }
         if(answer==null){
             return "no";
         }
         return answer;
     }
}
