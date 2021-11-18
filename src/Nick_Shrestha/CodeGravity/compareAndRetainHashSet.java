/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to compare two hash set and retain elements which are same on both sets.
 */
package com.CodeGravity;

import java.util.HashSet;

public class compareAndRetainHashSet {
    public static void main(String [] args) {
        HashSet<String> name1 = new HashSet<String>();
        name1.add("Nick");
        name1.add("Paul");
        name1.add("Tom");
        name1.add("Chris");
        name1.add("Tony");


        HashSet<String> name2 = new HashSet<String>();
        name2.add("Ben");
        name2.add("Tony");
        name2.add("Robert");
        name2.add("Nick");
        name2.add("Ken");

        System.out.println("First Hash Set: " + name1);
        System.out.println("Second Hash Set: " + name2);

        System.out.print("From 1st hash set compared to second sequentially,given element is: ");
        HashSet<String> compared = new HashSet<>();
        for (String elm : name1) {
            System.out.print(name2.contains(elm) ? " [PRESENT] " : " [NOT PRESENT] ");
        }
        System.out.println();

        name1.retainAll(name2);
        System.out.println("Retained HashSet contents: "+ name1);

    }
    }
/*
OUTPUT:
First Hash Set: [Tony, Tom, Nick, Chris, Paul]
Second Hash Set: [Tony, Robert, Ken, Nick, Ben]
From 1st hash set compared to second sequentially,given element is:  [PRESENT]  [NOT PRESENT]  [PRESENT]  [NOT PRESENT]  [NOT PRESENT]
Retained HashSet contents: [Tony, Nick]
*/