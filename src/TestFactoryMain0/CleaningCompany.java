/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactoryMain0;

/**
 *
 * @author inbox_bv8awe9
 */
public class CleaningCompany extends Company{
        
    @Override
    Employee[] getEmploees() {
        System.out.println("");
        System.out.println("Starting company activity " +CleaningCompany.class.getSimpleName() +"\n");
        Employee[] employee = new Employee[10]; //пример без коллекций
        employee[0] = new Cleaner();
        employee[1] = new Manager();
        employee[2] = new Cleaner();
        employee[3] = new Cleaner();
        employee[4] = new Cleaner();
        employee[5] = new Cleaner();
        employee[6] = new Cleaner();
        employee[7] = new Cleaner();
        employee[8] = new Cleaner();
        employee[9] = new Cleaner();
        
        return employee; 
    }
    
   
   
    
}
