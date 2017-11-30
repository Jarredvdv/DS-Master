package linkedlists;

import java.util.NoSuchElementException;

/**
 * SortedListIF provides operations associated with a list that keeps
 * elements ordered.
 * The list accepts duplicates and all its elements are kept in non-decreasing 
 * order; they must be of a type that implements Comparable.
 * @author ogm2
 */
public interface SortedListIF<E extends Comparable<E>> {
    
    /**
     * Inserts a new element in the list while respecting the order of the list.
     * @param e  the element to insert
     */
    public void insert(E e);
    
    /**
     * remove the first element is the list
     * @return  the removed element
     * @throws NoSuchElementException  if the list is empty
     */
    public E removeFirst() throws NoSuchElementException;
    
    /**
     * Displays the contents of the list.
     */
    public void display();

}
