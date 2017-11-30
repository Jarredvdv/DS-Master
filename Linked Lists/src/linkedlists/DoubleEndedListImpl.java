/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.NoSuchElementException;


public class DoubleEndedListImpl<E extends Comparable<E>> 
                                implements DoubleEndedListIF<E> {

    SingleLinkNode<E> head;
    SingleLinkNode<E> tail;

    public DoubleEndedListImpl() {
        head = null;
        tail = null;
    }
    
    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public void insertFirst(E e) {
        SingleLinkNode<E> n = new SingleLinkNode(e);
        if (this.isEmpty())
            tail = n;
        n.setNext(head);
        head = n;
    }

    @Override
    public void insertLast(E e) {
        SingleLinkNode<E> n = new SingleLinkNode(e);
        if (this.isEmpty())
            head = n;
        tail.setNext(n);
        tail = n;
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
        //find the position of the link that holds the element to remove
        int position = this.find(e);
        if (position == 0) { //link to remove is the first of the list
            try {
                result = this.removeFirst();
            } catch (NoSuchElementException ex) {
                ex.printStackTrace();
            }
        } else if (position != -1) { //list does contain the element
            SingleLinkNode n = head;
            //get the predecessor of the link to remove
            for (int i = 0; i < position - 1; i++) {
                n = n.getNext();
            }
            //save data to return
            result = (E) n.getNext().getData();
            //make predecessor reference the successor
            n.setNext(n.getNext().getNext());
            if (tail == n.getNext()) //removed link was the last of the list
                tail = n; //tail now references its predecessor
        }
        return result;
    }    
}
