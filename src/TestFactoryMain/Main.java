/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactoryMain;

import java.util.List;


/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) {
        Company gameCompamy = new GameDevCompany();
        List computerWorkers= gameCompamy.getEmploees();
        gameCompamy.startWorking(computerWorkers);
        

    }
}
