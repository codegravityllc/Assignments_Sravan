/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to delete all elements from a given Tree Map.
 */

package com.CodeGravity;

import java.util.TreeMap;

public class deleteTreeMap {
    public static void main(String [] main){

        TreeMap<String,String> names = new TreeMap<>();
        names.put("Nick","STL");
        names.put("John", "Iowa");
        names.put("Ash","SF");
        names.put("Neal","LA");

        System.out.println("Here is the initial TreeMap: "+ names);

        System.out.println("Deleting all TreeMap... ");
        names.clear();
        System.out.println("Done!!");

        System.out.println("Final Treemap"+ names);

    }

}
/*
OUTPUT:
Here is the initial TreeMap: {Ash=SF, John=Iowa, Neal=LA, Nick=STL}
Deleting all TreeMap...
Done!!
Final Treemap{}
 */