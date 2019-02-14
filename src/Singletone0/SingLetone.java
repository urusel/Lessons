/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone0;

import javax.management.ObjectName;

/**
 *
 * @author user
 */
public class SingLetone {
    public static SingLetone uniqueInLetone;
    private SingLetone(){
    
}
    public static  SingLetone getInstance(){
        if(uniqueInLetone == null){
         uniqueInLetone = new SingLetone();
            System.out.println("The new instance of Singlatone");
        }
          System.out.println("Returning instance ...");   
          return uniqueInLetone;
        }
    }
