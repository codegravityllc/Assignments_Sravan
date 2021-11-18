/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to compare two hash set.
 */

package com.CodeGravity;

import java.util.HashSet;

public class compareHashSet {
    public static void main(String [] args)
    {
        HashSet<String> name1 = new HashSet<String>();
        name1.add("Nick");
        name1.add("Paul");
        name1.add("Tom");
        name1.add("Chris");


        HashSet<String> name2 = new HashSet<String>();
        name2.add("Ben");
        name2.add("Robert");
        name2.add("Nick");
        name2.add("Ken");

        System.out.println("First Hash Set: "+ name1);
        System.out.println("Second Hash Set: " + name2);

        System.out.print("From 1st hash set compared to second sequentially,given element is: ");
        HashSet<String> compared = new HashSet<>();
        for(String elm : name1)
        {
                System.out.print(name2.contains(elm) ? " [PRESENT] " : " [NOT PRESENT] ");
        }

    }
}

/*
OUTPUT:
First Hash Set: [Tom, Nick, Chris, Paul]
Second Hash Set: [Robert, Ken, Nick, Ben]
From 1st hash set compared to second sequentially,given element is:  [NOT PRESENT]  [PRESENT]  [NOT PRESENT]  [NOT PRESENT]
 */