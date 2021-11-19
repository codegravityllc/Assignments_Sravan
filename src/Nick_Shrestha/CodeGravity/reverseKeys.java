/*
NAME:NICK SHRESTHA
ASSIGNMENT:Write a Java program to get a reverse order view of the keys contained in a given map.
 */
package com.CodeGravity;

import java.util.TreeMap;

public class reverseKeys {
    public static void main(String [] args)
    {
        TreeMap<String, String> names= new TreeMap<>();
        names.put("3","Nick");
        names.put("2","Joey");
        names.put("4","Chandler");
        names.put("1","Ross");

        System.out.println("Here is the TreeMap: " + names);
        System.out.println("Showing in reverse key order: " + names.descendingKeySet());


    }
}

/*
OUTPUT:
Here is the TreeMap: {1=Ross, 2=Joey, 3=Nick, 4=Chandler}
Showing in reverse key order: [4, 3, 2, 1]

 */