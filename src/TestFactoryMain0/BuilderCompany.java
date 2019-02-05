/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactoryMain0;

/**
 *
 * @author user
 */
public class BuilderCompany extends Company{
        
    @Override
    Employee[] getEmploees() {
        System.out.println("");
        System.out.println("Starting Company activity");
        Employee[] employee = new Employee[4];
        employee[0] = new Builder();

employee[1] = new Prorab();
employee[2] = new Electric();
employee[3] = new Direktor();

       
         employee[3] = new Manager();
        return employee;

    }
}