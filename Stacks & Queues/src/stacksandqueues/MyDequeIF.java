package stacksandqueues;

/**
 *
 * @author ogm2
 */
public interface MyDequeIF<E> {

    /**
     * Inserts a new element on the left of the deque.
     * @param element  the element to insert
     * @throws FullStructureException  when the deque overflows
     */
    public void insertLeft(E element) throws FullStructureException;

    /**
     * Removes the element on the left of the deque.
     * @return  the removed element
     * @throws EmptyStructureException  when there is no element to pop 
     */
    public E removeLeft() throws EmptyStructureException;

    /**
     * Peeks at the element on the left of the deque, but does not remove it.
     * @return  the found element
     * @throws EmptyStructureException  when there is no element to peek at
     */
    public E peekLeft() throws EmptyStructureException;

    /**
     * Inserts a new element on the right of the deque.
     * @param element  the element to insert
     * @throws FullStructureException  when the deque overflows
     */
    public void insertRight(E element) throws FullStructureException;

    /**
     * Removes the element on the right of the deque.
     * @return  the removed element
     * @throws EmptyStructureException  when there is no element to pop 
     */
    public E removeRight() throws EmptyStructureException;

    /**
     * Peeks at the element on the right of the deque, but does not remove it.
     * @return  the found element
     * @throws EmptyStructureException  when there is no element to peek at
     */
    public E peekRight() throws EmptyStructureException;

    /**
     * Checks whether the deque is currently empty.
     * @return  true if the deque is empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Checks whether the deque is currently full.
     * @return  true if the deque is full, false otherwise
     */
    public boolean isFull();
    
    public void display();
}
