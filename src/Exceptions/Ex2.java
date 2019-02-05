/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author user
 */
public class Ex2 {
    public static void main(String[] args) {
        Exception ex = new Exception("Мое исключени е");
        
        try {
            throw ex;
        }catch(Exception e){
            System.out.println("Обработка исключений");
            System.out.println(e.getMessage());
                
        }
    }
    
}
