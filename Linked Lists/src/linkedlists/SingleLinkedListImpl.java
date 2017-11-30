/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class SingleLinkedListImpl<E extends Comparable <E>> 
                                    implements SingleLinkedListIF<E>{

    public SingleLinkNode<E> head;

    public SingleLinkedListImpl() {
        head = null;
    }
    
   @Override
    public boolean isEmpty() {
        return (head == null);
    }    
    
    @Override
    public void insertFirst(E e) {
        SingleLinkNode<E> n = new SingleLinkNode(e);
        n.setNext(head);
        head = n;
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        if (head == null)
            throw new NoSuchElementException();
        SingleLinkNode<E> n = head;
        head = n.getNext();
        return n.getData();
    }

    @Override
    public void display() {
        SingleLinkedListIterator<E> iter = new SingleLinkedListIterator(head);
        while (iter.hasNext())
            System.out.print(iter.next().toString() + " ");
        System.out.println("");
    }

    @Override
    public int find(E e) {
        SingleLinkedListIterator<E> iter = new SingleLinkedListIterator(head);
        E data = null;
        int position = -1;
        int i = 0;
        while (iter.hasNext()) {
            if (e.compareTo(iter.next()) != 0) {
                i++;
            } else {
                position = i;
                break;
            }
        }
        return position;
    }

    @Override
    public E delete(E e) {
        E result = null;
        int position = this.find(e);
        if (position == 0) {
            try {
                result = this.removeFirst();
            } catch (NoSuchElementException ex) {
                ex.printStackTrace();
            }
        } else if (position != -1) {
            SingleLinkNode n = head;
            for (int i = 0; i < position - 1; i++) {
                n = n.getNext();
            }
            result = (E) n.getNext().getData();
            n.setNext(n.getNext().getNext());
        }
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new SingleLinkedListIterator(head);
    }
    
}
