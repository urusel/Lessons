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
public class TestClass {
    public static void main(String[] args) {
        MyObject o = new MyObject();
        
        MyObject o2 = new MyObject();
       // MyObjectClosed0 o3 = new MyObjectClosed0();
        
         MyObjectClosed1 o4 = MyObjectClosed1.getInstance();
          MyObjectClosed1 o5 = MyObjectClosed1.getInstance();
          
          SingLetone s1 = SingLetone.getInstance();
         SingLetone s2 = SingLetone.getInstance(); 
        
    }
}
