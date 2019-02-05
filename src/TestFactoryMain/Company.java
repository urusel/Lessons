/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactoryMain;

import java.util.List;

/**
 *
 * @author inbox_bv8awe9
 */
public abstract class Company {
    List getEmploees(){
        return null;
    };
    
    void startWorking(List<Employee> empoeers) {
        for (Employee emp : empoeers) {
            emp.doWork();            
        }
        //то же самое с лямбдой
//        empoeers.forEach((emp) -> {
//            emp.doWork();
//        });
    };
}
