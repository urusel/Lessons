/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

/**
 *
 * @author user
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDevelopersJobSite jobSite = new JavaDevelopersJobSite();
        
        Observer firstSubscriber = new Subscriber("Jelena Petrova");
        Observer secondSubscriber = new Subscriber("Tin Hex");
        Observer thirdSubscriber = new Subscriber("Aaron qimp");
      
        
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addObserver(thirdSubscriber);
         
        
        
        jobSite.addVacancy("Java developer in Tallinn");
        jobSite.addVacancy("Java developer in Berlin");
          jobSite.addVacancy("Java developer in Riga");
          
          
          //удалить 1 вакансию
          
          jobSite.removeVacancy("Java developer in Tallinn");
          
          //прибавить 1 подписчика
          
        
           Observer forSubscriber = new Subscriber("Room Ruut");
           jobSite.addObserver(forSubscriber);
        
        
        
    }
    
}
