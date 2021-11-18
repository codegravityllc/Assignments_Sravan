/*
NAME:NICK SHRESTHA
ASSIGNMENT:Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
 */

package com.CodeGravity;

import java.util.SortedSet;
import java.util.TreeMap;

public class keyValueMap {
    public static void main(String [] args)
    {
        TreeMap<String, String> names= new TreeMap<>();
        names.put("3","Nick");
        names.put("2","Joey");
        names.put("4","Chandler");
        names.put("1","Ross");

        System.out.println("Here is the TreeMap: " + names);
        System.out.println("Greatest key: "+ names.firstEntry());
        System.out.println("Least key: "+ names.lastEntry());
    }
}

/*
OUTPUT:
Here is the TreeMap: {1=Ross, 2=Joey, 3=Nick, 4=Chandler}
Greatest key: 1=Ross
Least key: 4=Chandler
 */