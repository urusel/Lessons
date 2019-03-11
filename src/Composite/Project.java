/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author user
 */
public class Project {
    public static void main(String[] args) {
        Team team = new Team();
      Developer javaDeveloper = new JavaDeveloper();
      Developer phpDeveloper = new PhpDeveloper();
       Developer pythonDeveloper = new PythonDeveloper();
        Developer ciPlusDeveloper = new CiPlusDeveloper();
        
      
     team.addDeveloper(javaDeveloper);
     team.addDeveloper(phpDeveloper);
     team.addDeveloper(pythonDeveloper);
     team.addDeveloper(ciPlusDeveloper);
     team.createProject();
    }
}
