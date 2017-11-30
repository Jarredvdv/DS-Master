package linkedlists;

import java.util.NoSuchElementException;

/**
 * DoubleLinkedListIF<E> provides operations associated with any 
 * double-linked list.
 * It is a succession of DoubleLinkedNodeIF instances.
 * @author ogm2
 */
public interface DoubleLinkedListIF<E extends Comparable<E>> {
    
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
     * Removes the element at the tail of the linked list.
     * @return  the element removed from the list
     * @throws NoSuchElementException  if the list is empty
     */
    public E removeLast() throws NoSuchElementException;
        
    /**
     * Checks whether the list contains a given element.
     * @param e  the element to search for
     * @return  true if the list contains e, false otherwise
     */
    public boolean contains(E e);
    
    /**
     * Displays the contents of the list from head to tail.
     */
    public void display();
    
    /**
     * Displays the contents of the list from tail to head.
     */
    public void displayBackwards();
    
    
}
