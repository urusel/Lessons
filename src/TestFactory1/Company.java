/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory1;

/**
 *
 * @author user
 */
public class Company {
  void createSoftware(){
        System.out.println("Starting Company activity");
        Employee[] employee = new Employee[3];
        employee[0] = new Designer();
       
      employee[1] = new Programmer();
       
        employee[2] = new Tester();
        for (Employee employeeEach : employee){
            employeeEach.doWork();
        }
        
        
        // TODO code application logic here
    }  
    
}
