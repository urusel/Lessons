/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kollekzii2;

import java.util.*;

/**
 *
 * @author user
 */
public class Massiv2 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        measureTime(arrayList, "arrayList");
        measureTime(linkedList, "linkedList");
    }

    private static void measureTime(List<Integer> list,String decs) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(decs + " diff " + (end - start));
        System.out.println("");
        for (int i = 0; i < 100000; i++)
        {
            list.get(i);
        }

    }
}
