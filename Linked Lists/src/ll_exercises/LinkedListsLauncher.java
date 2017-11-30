/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll_exercises;

import java.util.NoSuchElementException;
import java.util.Random;
import linkedlists.*;

/**
 *
 * @author ogm2
 */
public class LinkedListsLauncher {

    public static final int SIZE = 12;

    public LinkedListsLauncher() {
    }
    
    /**
     * Tests the Single Linked List implementation.
     */
    public void testSLL(){
        System.out.println("\n\nTESTING SINGLE-LINKED LIST");
        Random rd = new Random();
        SingleLinkedListIF<Integer> myList = new SingleLinkedListImpl();
        for (int i = 0; i < SIZE/2; i++)
            myList.insertFirst(rd.nextInt(101));
        myList.display();
        int temp = rd.nextInt(101);
        System.out.println("Token " + temp + " is at "+ myList.find(temp));
        myList.insertFirst(temp);
        for (int i = 0; i < SIZE/2 - 1; i++)
            myList.insertFirst(rd.nextInt(101));        
        myList.display();
        System.out.println("Token " + temp + " is at "+ myList.find(temp));
        myList.delete(temp);
        myList.display();
        try {
            for (int i = 3; i < SIZE; i++) {
                myList.removeFirst();
            }
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
        }
        myList.display();
    }
    
    /**
     * Tests the Double Ended List implementation.
     */
    public void testDEL(){
        System.out.println("\n\nTESTING DOUBLE-ENDED LIST");
        int last = -1;
        int middle = -1;
        Random rd = new Random();
        DoubleEndedListIF<Integer> myList = new DoubleEndedListImpl();
        for (int i = 0; i < SIZE/2; i++)
            myList.insertFirst(rd.nextInt(101));
        myList.display();
        middle = rd.nextInt(101);
        System.out.println("Token " + middle + " is at "+ myList.find(middle));
        myList.insertLast(middle);
        for (int i = 0; i < SIZE/2 - 1; i++) {
            last = rd.nextInt(101);
            myList.insertLast(last);        
        }
        myList.display();
        System.out.println("Token " + middle + " is at "+ myList.find(middle));
        myList.delete(middle);
        myList.display();
        System.out.println("Token " + last + " is at "+ myList.find(last));
        myList.delete(last);
        myList.display();
        try {
            for (int i = 3; i < SIZE; i++) {
                myList.removeFirst();
            }
            myList.removeFirst();
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
        }
        myList.display();
    }
    
    public void testSortedList(){
        System.out.println("\n\nTESTING SORTED LIST");
        Random rd = new Random();
        SortedListIF<Integer> myList = new SortedListImpl();
        for (int i = 0; i < SIZE; i++) {
            int newVal = rd.nextInt(101);
            System.out.println("Inserting "+newVal);
            myList.insert(newVal);
        }
        myList.display();
        try {
            for (int i = 0; i < SIZE; i++) {
                System.out.println("Removing " + myList.removeFirst());
            }
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
        }
        myList.display();
    }
    
    public void testDoubleLinkedList(){
        System.out.println("\n\nTESTING DOUBLE-LINKED LIST");
        Random rd = new Random();
        DoubleLinkedListIF<Integer> myList = new DoubleLinkedListImpl();
        int newVal = 0;
        for (int i = 0; i < SIZE/2; i++) {
            newVal = rd.nextInt(101);
            myList.insertFirst(newVal);
        }
        myList.display();
        int newVal2 = 0;
        for (int i = 0; i < SIZE/2; i++) {
            newVal2 = rd.nextInt(101);
            myList.insertLast(newVal2);
        }
        if (myList.contains(newVal))
            System.out.println("List contains "+newVal);
        if (myList.contains(newVal2))
            System.out.println("List contains "+newVal2);
        myList.display();
        myList.displayBackwards();
        try {
            for (int i = 1; i < SIZE/2; i++)
                myList.removeFirst();
            for (int i = 1; i < SIZE/2; i++)
                myList.removeLast();
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
        }
        myList.display();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListsLauncher lll = new LinkedListsLauncher();
        lll.testSLL();
        lll.testDEL();
        lll.testSortedList();
        lll.testDoubleLinkedList();
    }
    
}
