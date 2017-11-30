package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.DoubleEndedListIF;
import linkedlists.DoubleEndedListImpl;


public class QueueFromDoubleEndedListImpl<E extends Comparable<E>> 
                                implements QueueFromDoubleEndedListIF<E> {

    DoubleEndedListIF<E> del;

    public QueueFromDoubleEndedListImpl() {
        del = new DoubleEndedListImpl();
    }
    
    
    @Override
    public void enqueue(E element) {
        del.insertLast(element);
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        return del.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return del.isEmpty();
    }

    @Override
    public void display() {
        del.display();
    }

}
