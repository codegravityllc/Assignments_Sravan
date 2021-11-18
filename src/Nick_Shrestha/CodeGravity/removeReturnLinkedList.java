/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to remove and return the first element of a linked list.
 */

package com.CodeGravity;

import java.util.LinkedList;

public class removeReturnLinkedList {
    public static void main(String [] args)
    {
        LinkedList<String> names = new LinkedList<>();
        names.add("Nick");
        names.add("Joe");
        names.add("Chris");
        names.add("Paul");

        System.out.println("Here is the original linkedlist: " + names);

        System.out.println("Removing the first element from the linkedlist: " + names.pop());
        System.out.println("Done!!");

        System.out.println("Here is the final linkedlist: "+ names);
    }
}

/*
OUTPUT:
Here is the original linkedlist: [Nick, Joe, Chris, Paul]
Removing the first element from the linkedlist: Nick
Done!!
Here is the final linkedlist: [Joe, Chris, Paul]
 */
