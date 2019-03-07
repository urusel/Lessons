/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator2;

import java.util.*;

/**
 *
 * @author user
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu= new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
        
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
        
        
    }
}


