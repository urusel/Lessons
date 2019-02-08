/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBufferTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class StringBufferTest {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        StringBuilder str2 = new StringBuilder(str);
        System.out.println("You enter:" + str); 
        System.out.println("But reverse form will be:" + str2.reverse());
        
        
    }
  
}

