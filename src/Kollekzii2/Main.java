/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kollekzii2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            
            arrayList.add(i);
           // linkedList.add(i); 
        }
System.out.println(arrayList.toString());
//System.out.println(arrayLinked.toString());

        System.out.println(arrayList.get(0));
  //      System.out.println(arrayLinked.get(0));
        
        System.out.println(arrayList.get(99));
  //      System.out.println(arrayLinked.get(99));
        
        System.out.println(arrayList.get(arrayList.size() - 1));
//        System.out.println(arrayList.get(arrayLinked.size() - 1));

        for (int i = 1; i < linkedList.size(); i++) {
//            System.out.println(arrayList.get(i));
//            
//          for (int i = 1; i < arrayLinked.size(); i++) {
//            System.out.println(arrayLinked.get(i));   
//            
        }
        arrayList.forEach((x) -> {
            linkedList.add(x);
        });
        arrayList.forEach((x) -> {
            System.out.println(x);
        });
       // arrayList.remove(99);
        System.out.println(linkedList);

    }
}

