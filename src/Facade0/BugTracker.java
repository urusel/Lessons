/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade0;

/**
 *
 * @author user
 */
public class BugTracker {
   private boolean activeSprint;
   public boolean isActiveSprint(){
       return activeSprint;
   }
   public void startSprint(){
       System.out.println("Sprint is active ...");
       activeSprint = true;
   }
    public void finishSprint(){
       System.out.println("Sprint is not active ...");
       activeSprint = false;
   }
   
}
