package ll_exercises;

import java.util.NoSuchElementException;

/**
 *
 * @author ogm2
 */
public interface QueueFromDoubleEndedListIF<E extends Comparable<E>> {

    /**
     * Inserts a new element at the back of the queue
     * @param element  the element to enqueue
     */
    public void enqueue(E element);

    /**
     * Removes the element at the front of the queue.
     * @return  the removed element
     * @throws NoSuchElementException  when there is no element to dequeue
     */
    public E dequeue() throws NoSuchElementException;

    /**
     * Checks whether the queue is currently empty.
     * @return  true if the queue is empty, false otherwise
     */
    public boolean isEmpty();
    
    /**
     * Displays a string representation of the queue.
     * Type E must implement toString in order for this method to work properly.
     */
    public void display();
}
