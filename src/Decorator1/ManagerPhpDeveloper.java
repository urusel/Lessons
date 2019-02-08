
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

import Decorator0.Developer;

/**
 *
 * @author user
 */
public class ManagerPhpDeveloper extends DeveloperDecorator{
  
public ManagerPhpDeveloper(Developer developer){
        super(developer);
    }
    public String implForClient(){
        return " implements into client";
    }
    @Override
    public String makeJob(){
      return super.makeJob()+implForClient();
    }
}
