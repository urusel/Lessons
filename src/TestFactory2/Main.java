/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory2;

/**
 *
 * @author user
 */
public class Main {
  public static void main (String[] args){
       GameDevCompany gameCompany = new GameDevCompany();
       Employee[] computerWorkers = gameCompany.getEmployees();
       gameCompany.startWorking (computerWorkers);
      
       CleanerCompany cleanerCompany = new CleanerCompany();
       Employee[] cleanerWorkers = cleanerCompany.getEmployees();
       cleanerCompany.startWorking (cleanerWorkers);
 }   
}  

