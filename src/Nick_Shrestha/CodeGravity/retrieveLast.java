/*
NAME: NICK SHRESTHA
ASSIGNMENT:  Write a Java program to retrieve but does not remove, the last element of a linked list.
 */

package com.CodeGravity;

import java.util.LinkedList;

public class retrieveLast {
    public static void main(String [] args)
    {
        LinkedList<String> names = new LinkedList<>();
        names.add("Nick");
        names.add("Joe");
        names.add("Chris");
        names.add("Paul");

        System.out.println("Here is the original linkedlist: " + names);

        System.out.println("Retriving the first element from the linkedlist: " + names.peekLast());
        System.out.println("Done!!");

    }
}

/*
OUTPUT:
Here is the original linkedlist: [Nick, Joe, Chris, Paul]
Retriving the first element from the linkedlist: Paul
Done!!
 */
