/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator1;

/**
 *
 * @author user
 */
public class DeveloperRunner {
    
    public static void main(String[] args) {
        
        String[] javaSkills = {"Java basic", "Spring","Hibernate","Maven","PosgreSQL"};
         String[] phpSkills = {"Java basic", "Php basic","Maven"};
         
        Developer javaDeveloper = new Developer("Nikolai Smirnov", javaSkills);
        Developer phpDeveloper = new Developer("Oleg Petrovov", phpSkills);
        
        Iterator iterator1 = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills:  ");
        
        while (iterator1.hasNext()) {
         System.out.print(iterator1.next().toString() + " ");  
         
        }
        System.out.println("\n================================");
        Iterator iterator2 = phpDeveloper.getIterator();
        System.out.println("Developer: " + phpDeveloper.getName());
        System.out.print("Skills:  ");
        
        while (iterator2.hasNext()) {
         System.out.print(iterator2.next().toString() + " ");  
         
        }
    }
}
          

