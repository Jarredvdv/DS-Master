/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.NoSuchElementException;

/**
 *
 * @author ogm2
 */
public interface DoubleEndedListIF<E extends Comparable<E>> {
    
    /**
     * Checks whether the linked list is empty.
     * @return  true if the linked list has no element, false otherwise
     */
    public boolean isEmpty();
    
    /**
     * Inserts an element at the head of the linked list.
     * @param e  the element to insert
     */
    public void insertFirst(E e);
    
    /**
     * Inserts an element at the tail of the linked list.
     * @param e  the element to insert
     */
    public void insertLast(E e);
    
    /**
     * Removes the element at the head of the linked list.
     * @return  the element removed from the list
     * @throws NoSuchElementException  if the list is empty
     */
    public E removeFirst() throws NoSuchElementException;
    
    /**
     * Finds the position of an element in the list.
     * Position 0 is the head of the list, the next element has position 1,
     * the next has position 2, so on and so forth.
     * @param e  the element to find in the list
     * @return  the position of the element to find, 
     *          -1 if the list does not contain the element
     */
    public int find(E e);
    
    /**
     * Removes an element from the list.
     * @param e  the element to remove.
     * @return  the removed element, null otherwise
     */
    public E delete(E e);
    
    /**
     * Displays the contents of the list, starting from the head.
     */
    public void display();
    
}
