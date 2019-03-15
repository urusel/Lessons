/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy1;

/**
 *
 * @author user
 */
public class RealProject implements Project{
    
    private String ur1;
    
    public RealProject(String ur1){
        this.ur1 = ur1;
        load();
    }
    public void load(){
        System.out.println("loading project from " + ur1 + ".....");
    }
    @Override
    public void run(){
     System.out.println("Running project from " + ur1 + ".....");
       
    }
    
}
