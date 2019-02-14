/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone1;

/**
 *
 * @author user
 */
public class Controller0 {
    public static void main(String[] args) {
        Boiler0 boiler = new Boiler0();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
    
}
