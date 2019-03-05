/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template3;

import Template2.*;

/**
 *
 * @author user
 */
public class Tea extends Drink {

    @Override
    public void brew() {
        System.out.println("Dripping tea... through ");
    }

    @Override
    public void addIngridients() {
        System.out.println("Adding Sugar and Milk");
    }
}