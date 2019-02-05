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
public class GameDevCompany extends Company {
        
    @Override
    Employee[] getEmploees() {
        System.out.println("");
        System.out.println("Starting company activity " +GameDevCompany.class.getSimpleName() + "\n");
        Employee[] employee = new Employee[3]; //пример без коллекций
        employee[0] = new Designer();
        employee[1] = new Programmer();
        employee[2] = new Tester();
        
        return employee; 
    }
    
   
   
    
}
