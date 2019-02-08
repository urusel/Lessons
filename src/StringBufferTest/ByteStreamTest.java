/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBufferTest;

import java.io.IOException;

/**
 *
 * @author user
 */
public class ByteStreamTest {
    public static void main(String[] args)throws IOException{
        while (true) {
            int byteValue = System.in.read();
            System.out.println(byteValue);
        }
    }
   
}
