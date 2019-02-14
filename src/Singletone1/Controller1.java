/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone1;

import com.sun.xml.internal.fastinfoset.stax.events.Util;
import javafx.beans.binding.Bindings;

/**
 *
 * @author user
 */
public class Controller1 {
    public static void main(String[] args) {
         Boller1  boiler = Boller1.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
         Boller1  boiler2 = Boller1.getInstance();
    }
    
}
