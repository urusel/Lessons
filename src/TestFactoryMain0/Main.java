/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactoryMain0;

//import TestFactory2.BuilderCompany;
//import TestFactoryMain0.Builder;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) {
        Company gameCompamy = new GameDevCompany();
        Employee[] computerWorkers= gameCompamy.getEmploees();
        gameCompamy.startWorking(computerWorkers);
        
        Company cleaningCompany = new CleaningCompany();
        Employee[] cleanWorkers= cleaningCompany.getEmploees();
        gameCompamy.startWorking(cleanWorkers);
        
        Company builderCompany = new BuilderCompany();
        Employee[] builderWorkers= builderCompany.getEmploees();
        gameCompamy.startWorking(builderWorkers);
    }
}
