package linkedlists;

import java.util.NoSuchElementException;

public class SortedListImpl<E extends Comparable<E>> implements SortedListIF<E> {

    SingleLinkNode<E> head;

    public SortedListImpl() {
        head = null;
    }
    
    @Override
    public void insert(E e) {
        SingleLinkNode<E> n = new SingleLinkNode(e);
        SingleLinkNode<E> curr = head;
        SingleLinkNode<E> previous = head;
        while ((curr != null) && (e.compareTo(curr.getData()) > 0)) {
            previous = curr;
            curr = curr.getNext();
        }
        if (previous == curr) { 
        //inserted item is smaller than head item OR list is empty
            n.setNext(head);
            head = n;
        } else {
            n.setNext(curr);
            previous.setNext(n);
        }
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        if (head == null)
            throw new NoSuchElementException();
        E data = head.getData();
        head = head.getNext();
        return data;
    }

    @Override
    public void display() {
        SingleLinkedListIterator<E> iter = new SingleLinkedListIterator(head);
        while (iter.hasNext())
            System.out.print(iter.next().toString() + " ");
        System.out.println("");
    }
    
}
