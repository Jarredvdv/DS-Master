package stacksandqueues;

/**
 *
 * @author ogm2
 */
public interface MyPriorityQueueIF<E> {

    /**
     * Inserts a new element inside the queue.
     * The element is inserted after the last inserted element with the
     * same priority. Elements with a higher priority are closer to the tail,
     * while elements with a lower priority are closer to the head.
     * @param element  the element to insert
     * @param prio  the priority of the element to insert
     * @throws FullStructureException  when the queue overflows
     */
    public void insert(E element, int prio) throws FullStructureException;

    /**
     * Removes the element at the front of the queue.
     * @return  the removed element
     * @throws EmptyStructureException  when there is no element to pop 
     */
    public E remove() throws EmptyStructureException;

    /**
     * Peeks at the element at the back of the queue, but does not remove it.
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
     * Displays a string representation of the priority queue.
     * Every tuple <priority, value> gets represented as "(prio, E)"
     * Type E must implement toString in order for this method to work properly.
     */
    public void display();
}
