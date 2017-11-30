package linkedlists;

import java.util.NoSuchElementException;

/**
 * SingleLinkedListIF<E> provides operations associated with any 
 * single-linked list.
 * It is a succession of linked SingleLinkedNodeIF instances.
 * @author ogm2
 */
public interface SingleLinkedListIF<E> extends Iterable<E> {

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
     * Removes the element at the head of the linked list.
     * @return  the element removed from the list
     * @throws NoSuchElementException  if the list is empty
     */
    public E removeFirst() throws NoSuchElementException;
    
    /**
     * Finds the position of an element in the list.
     * Position 0 is the head of the list, the next element has position 1,
     * the next has position 2, so on and so forth.
     * @param e  the element to find in the list
     * @return  the position of the element to find, 
     *          -1 if the list does not contain the element
     */
    public int find(E e);
    
    /**
     * Removes an element from the list.
     * @param e  the element to remove.
     * @return  the removed element, null otherwise
     */
    public E delete(E e);
    
    /**
     * Displays the contents of the list, starting from the head.
     */
    public void display();

}
