package stacksandqueues;

/**
 *
 * @author ogm2
 */
public interface MyQueueIF<E> {

    /**
     * Inserts a new element at the back of the queue
     * @param element  the element to enqueue
     * @throws FullStructureException  when the queue overflows
     */
    public void enqueue(E element) throws FullStructureException;

    /**
     * Removes the element at the front of the queue.
     * @return  the removed element
     * @throws EmptyStructureException  when there is no element to pop 
     */
    public E dequeue() throws EmptyStructureException;

    /**
     * Peeks at the element at the back of the queue, but does not dequeue it.
     * @return  the peeked at element
     * @throws EmptyStructureException  when there is no element to peek at
     */
    public E peek() throws EmptyStructureException;

    /**
     * Checks whether the queue is currently empty.
     * @return  true if the queue is empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Checks whether the queue is currently full.
     * @return  true if the queue is full, false otherwise
     */
    public boolean isFull();
    
    /**
     * Displays a string representation of the queue.
     * Type E must implement toString in order for this method to work properly.
     */
    public void display();
}
