/*
NAME:NICK SHRESTHA
ASSIGNMENT:Write a Java program to clone an linked list to another linked list.
 */

package com.CodeGravity;

import java.util.LinkedList;

public class cloneLinkedList {
    public static void main(String [] args)
    {
        LinkedList<String> names = new LinkedList<>();
        names.add("Nick");
        names.add("Joe");
        names.add("Chris");
        names.add("Paul");

        System.out.println("Here is the original linkedlist: " + names);

        System.out.println("Cloning the linkedlist...");
        LinkedList<String> cloned = new LinkedList<>();
        cloned = (LinkedList)names.clone();
        System.out.println("Done!!");

        System.out.println("Here is the cloned linkedlist: "+ cloned);
    }
}

/*
OUTPUT:
Here is the original linkedlist: [Nick, Joe, Chris, Paul]
Cloning the linkedlist...
Done!!
Here is the cloned linkedlist: [Nick, Joe, Chris, Paul]
 */