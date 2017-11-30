package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.*;


public class DequeFromDoubleLinkedListImpl<E extends Comparable<E>> 
                                implements DequeFromDoubleLinkedListIF<E> {

    DoubleLinkedListIF<E> dll;

    public DequeFromDoubleLinkedListImpl() {
        dll = new DoubleLinkedListImpl();
    }
    
    
    @Override
    public void insertLeft(E element) {
        dll.insertFirst(element);
    }

    @Override
    public E removeLeft() throws NoSuchElementException {
        return dll.removeFirst();
    }

    @Override
    public void insertRight(E element) {
        dll.insertLast(element);
    }

    @Override
    public E removeRight() throws NoSuchElementException {
        return dll.removeLast();
    }

    @Override
    public boolean isEmpty() {
        return dll.isEmpty();
    }

    @Override
    public void display() {
        dll.display();
    }

}
