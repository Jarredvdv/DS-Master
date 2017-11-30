/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.NoSuchElementException;


public class DoubleLinkedListImpl<E extends Comparable<E>> 
                            implements DoubleLinkedListIF<E> {

    public DoubleLinkNode<E> head;
    public DoubleLinkNode<E> tail;
    public int size;

    public DoubleLinkedListImpl() {
        head = null;
        tail = null;
    }
    
    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public void insertFirst(E e) {
        DoubleLinkNode<E> n = new DoubleLinkNode(e);
        if (this.isEmpty()) {
            head = n;
            tail = n;
        } else {
            n.setNext(head);
            head.setPrevious(n);
            head = n;
        }
    }

    @Override
    public void insertLast(E e) {
        DoubleLinkNode<E> n = new DoubleLinkNode(e);
        if (this.isEmpty()) {
            head = n;
            tail = n;
        } else {
            n.setPrevious(tail);
            tail.setNext(n);
            tail = n;
        }
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        if (this.isEmpty())
            throw new NoSuchElementException();
        E data = head.getData();
        head = head.getNext();
        if (head == null) //list is now empty
            tail = null;
        else
            head.setPrevious(null);
        return data;
    }

    @Override
    public E removeLast() throws NoSuchElementException {
        if (this.isEmpty())
            throw new NoSuchElementException();
        E data = tail.getData();
        tail = tail.getPrevious();
        if (tail == null) //list is now empty
            head = null;
        else
            tail.setNext(null);
        return data;
    }

    @Override
    public boolean contains(E e) {
        boolean found = false;
        DoubleLinkNode<E> curr = head;
        while (!(found) && (curr != null)) {
            E elt = curr.getData();
            found = (elt.compareTo(e) ==0);
            curr = curr.getNext();
        }
        return found;        
    }

    @Override
    public void display() {
        DoubleLinkNode<E> curr = head;
        while (curr != null) {
            System.out.print(curr.getData().toString() + " ");
            curr = curr.getNext();
        }
        System.out.println("");
    }

    @Override
    public void displayBackwards() {
        DoubleLinkNode<E> curr = tail;
        while (curr != null) {
            System.out.print(curr.getData().toString() + " ");
            curr = curr.getPrevious();
        }
        System.out.println("");

    }
    
}
