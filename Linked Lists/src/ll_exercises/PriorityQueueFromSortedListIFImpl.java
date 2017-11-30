package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.*;


public class PriorityQueueFromSortedListIFImpl<E extends Comparable<E>> 
                            implements PriorityQueueFromSortedListIF<E> {

    SortedListIF<E> sl;

    public PriorityQueueFromSortedListIFImpl() {
        sl = new SortedListImpl(); 
    }

    @Override
    public void insert(E element) {
        sl.insert(element);
    }

    @Override
    public E remove() throws NoSuchElementException {
        return sl.removeFirst();
    }

    @Override
    public void display() {
        sl.display();
    }

    

}
