package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.*;

public class StackFromSingleLinkedListImpl<E> implements StackFromSingleLinkedListIF<E> {

    SingleLinkedListIF<E> list;

    public StackFromSingleLinkedListImpl() {
        list = new SingleLinkedListImpl();
    }
    
    @Override
    public void push(E element) {
        list.insertFirst(element);
    }

    @Override
    public E pop() throws NoSuchElementException {
        return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void display() {
        list.display();
    }

}
