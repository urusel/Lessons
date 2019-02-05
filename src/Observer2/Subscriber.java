/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

import java.util.List;

/**
 *
 * @author user
 */
public class Subscriber implements  Observer{
    String name;
    public  Subscriber (String name) {
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear" + name + "\n naife have some changes in vacancies" + vacancies + 
                "\n----------------------\n");
    }
    
}
