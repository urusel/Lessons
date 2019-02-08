/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

import Decorator0.Developer;
import Decorator0.PhpDeveloper;

/**
 *
 * @author user
 */
public class Task {
  public static void main(String[] args) {
        Developer developer1 = new PhpDeveloper();
        Developer developer2 = new TesterPHPDeveloper(new PhpDeveloper());
        Developer developer3 = new ManagerPhpDeveloper(new TesterPHPDeveloper(new PhpDeveloper()));
        Developer developer4 = new SupportPhpDeveloper(new ManagerPhpDeveloper(new TesterPHPDeveloper(new PhpDeveloper())));
        

        System.out.println(developer1.makeJob());
        System.out.println(developer2.makeJob());
        System.out.println(developer3.makeJob());
        System.out.println(developer4.makeJob());
    }
    
}  

    

