package ll_exercises;

import java.util.NoSuchElementException;

/**
 *
 * @author ogm2
 */
public interface StackFromSingleLinkedListIF<E> {

    /**
     * Pushes a new element on top of the stack
     * @param element  the element to push
     */
    public void push(E element);

    /**
     * Pops the element on top of the stack.
     * @return  the popped element
     * @throws NoSuchElementException  when there is no element to pop 
     */
    public E pop() throws NoSuchElementException;

    /**
     * Checks whether the stack is currently empty.
     * @return  true if the stack is empty, false otherwise
     */
    public boolean isEmpty();
    
    /**
     * Displays a string representation of the stack.
     * Type E must implement toString in order for this method to work properly.
     */
    public void display();
}
