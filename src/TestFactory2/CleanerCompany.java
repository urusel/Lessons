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
public class CleanerCompany extends Company {

    Employee[] getEmploees() {

        System.out.println("");
        System.out.println("Starting Company activity");
        Employee[] employee = new Employee[4];
        employee[0] = new Cleaner();
employee[1] = new Cleaner();
employee[2] = new Cleaner();
       
         employee[3] = new Manager();
        return employee;

    }
}