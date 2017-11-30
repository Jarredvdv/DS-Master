package ll_exercises;

import java.util.NoSuchElementException;

/**
 *
 * @author ogm2
 * @param <E>
 */
public interface DequeFromDoubleLinkedListIF<E extends Comparable<E>> {

    /**
     * Inserts a new element on the left of the deque.
     * @param element  the element to insert
     */
    public void insertLeft(E element);

    /**
     * Removes the element on the left of the deque.
     * @return  the removed element
     * @throws NoSuchElementException  when there is no element to remove 
     */
    public E removeLeft() throws NoSuchElementException;

    /**
     * Inserts a new element on the right of the deque.
     * @param element  the element to insert
     */
    public void insertRight(E element);

    /**
     * Removes the element on the right of the deque.
     * @return  the removed element
     * @throws NoSuchElementException  when there is no element to remove 
     */
    public E removeRight() throws NoSuchElementException;

    /**
     * Checks whether the deque is currently empty.
     * @return  true if the deque is empty, false otherwise
     */
    public boolean isEmpty();

    public void display();
}
