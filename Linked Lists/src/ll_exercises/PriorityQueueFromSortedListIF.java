package ll_exercises;

import java.util.NoSuchElementException;

/**
 *
 * @author ogm2
 */
public interface PriorityQueueFromSortedListIF<E extends Comparable<E>> {

    /**
     * Inserts a new element inside the queue.
     * The element is inserted after the last inserted element of the
     * same order. Elements with a higher order are closer to the tail,
     * while elements with a lower order are closer to the head.
     * @param element  the element to insert
     */
    public void insert(E element);

    /**
     * Removes the element at the front of the queue.
     * @return  the removed element
     * @throws NoSuchElementException  when there is no element to remove 
     */
    public E remove() throws NoSuchElementException;
    
    /**
     * Displays a string representation of the priority queue.
     * Type E must implement toString in order for this method to work properly.
     */
    public void display();
}
