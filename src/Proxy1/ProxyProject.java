/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy1;

/**
 *
 * @author user
 */
public class ProxyProject implements Project{
    
    private String ur1;
    private RealProject realProject;
    
    public ProxyProject(String ur1){
        this.ur1 = ur1;
       
    }
    
    @Override
    public void run(){if(realProject==null){
        realProject=new RealProject(ur1);
    }  
    realProject.run();
    }
    
}