/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;
class Myclass {
      
         public void myMethod () throws Exception {
        Exception exception = new Exception("Мое исключени ");
        throw  exception;
         }
}
/**
 *
 * @author user
 */
public class Ex4 {
     public static void main(String[] args) throws Exception {
       try{
           Myclass instance = new Myclass();
           instance.myMethod();
       } catch (Exception e){
           System.out.println("Message" + e.getMessage());
           System.out.println("Stack trase:");
           e.printStackTrace();
           
           
     }
}

        
    
}
