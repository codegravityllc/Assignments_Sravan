/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to sort keys in Tree Map by using comparator.
 */

package com.CodeGravity;

import java.util.Comparator;
import java.util.TreeMap;

public class sortKeysTreeMap {
    public static void main(String[] main) {

        TreeMap<String, String> names = new TreeMap<String, String>(new sorted());
        names.put("P3", "Chandler");
        names.put("P2", "Ross");
        names.put("P4", "Joe");
        names.put("P1", "Neal");

        System.out.println("Here is the initial TreeMap: " + names);
    }
}
    class sorted implements Comparator<String>{
        @Override
        public int compare(String a, String b){
            return a.compareTo(b);
        }

    }


/*
OUTPUT:
Here is the initial TreeMap: {P1=Neal, P2=Ross, P3=Chandler, P4=Joe}

 */