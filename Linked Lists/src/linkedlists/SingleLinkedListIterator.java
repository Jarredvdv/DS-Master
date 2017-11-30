/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author marin
 */
public class SingleLinkedListIterator<E extends Comparable<E>> 
                                        implements Iterator<E> {

    SingleLinkNode<E> current;

    public SingleLinkedListIterator(SingleLinkNode<E> current) {
        this.current = current;
    }
    
    @Override
    public boolean hasNext() {
        return (current != null);
    }

    @Override
    public E next() throws NoSuchElementException {
        if (current == null)
            throw new NoSuchElementException();
        E data = current.getData();
        current = current.getNext();
        return data;
    }
    
}
