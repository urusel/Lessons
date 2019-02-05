/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactoryMain;

//import TestFactoryMain0.*;

/**
 *
 * @author user
 */
public class Builder implements Employee{

    @Override
    public void doWork() {
        for(int i=1; i<=10; i++){
        System.out.println("I am builder!"); 
    }
  
    }
}