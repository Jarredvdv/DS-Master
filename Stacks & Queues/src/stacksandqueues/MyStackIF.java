package stacksandqueues;

/**
 *
 * @author ogm2
 */
public interface MyStackIF<E> {

    /**
     * Pushes a new element on top of the stack
     * @param element  the element to push
     * @throws FullStructureException  when the stack overflows
     */
    public void push(E element) throws FullStructureException;

    /**
     * Pops the element on top of the stack.
     * @return  the popped element
     * @throws EmptyStructureException  when there is no element to pop 
     */
    public E pop() throws EmptyStructureException;

    /**
     * Peeks at the element on top of the stack, but does not pop it.
     * @return  the peeked at element
     * @throws EmptyStructureException  when there is no element to peek at
     */
    public E peek() throws EmptyStructureException;

    /**
     * Checks whether the stack is currently empty.
     * @return  true if the stack is empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Checks whether the stack is currently full.
     * @return  true if the stack is full, false otherwise
     */
    public boolean isFull();
    
    /**
     * Displays a string representation of the stack.
     * Type E must implement toString in order for this method to work properly.
     */
    public void display();
}
