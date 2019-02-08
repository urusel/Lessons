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
public class Ex7 {
    public static void main(String[] args) {
        int a = 1, n = 2;
        
        try {
            System.out.println("Попытка деления на ноль");
            System.out.println("a/(2-n) = " + (a/(2-n) ));
            
        } catch (Exception e) {
            System.out.println("Обработка исключенияю");
            System.out.println(e.getMessage());
            
        }finally{
            System.out.println("Блок  finaly.");
            
        }
        System.out.println("Конец кода.");
    }
  
}

