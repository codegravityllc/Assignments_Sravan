/*
NAME:NICK SHRESTHA
ASSIGNMENT:Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
 */
package com.CodeGravity;

import java.util.TreeMap;

public class firstAndLastKey {
    public static void main(String [] args)
    {
        TreeMap<String, String> names= new TreeMap<>();
        names.put("3","Nick");
        names.put("2","Joey");
        names.put("4","Chandler");
        names.put("1","Ross");

        System.out.println("Here is the TreeMap: " + names);
        System.out.println("First key: "+ names.firstKey());
        System.out.println("Last key: "+ names.lastKey());
    }
}

/*
OUTPUT:
Here is the TreeMap: {1=Ross, 2=Joey, 3=Nick, 4=Chandler}
First key: 1
Last key: 4
 */