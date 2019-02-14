/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone0;

/**
 *
 * @author user
 */
public class MyObjectClosed1 {
    private MyObjectClosed1(){
        
    }
    public  static MyObjectClosed1 getInstance(){
        return new MyObjectClosed1();
    }
}
