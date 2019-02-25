/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade1;



/**
 *
 * @author user
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is working on project ...");
        }else{
           System.out.println("Developer is reading Oracle docs ...");   
        }
    }
    public static void main(String[] args) {
        Job job = new Job();
        job.doJob();
        
        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();
        
        Developer developer = new Developer();
         developer.doJobBeforeDeadline(bugTracker);
         
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
