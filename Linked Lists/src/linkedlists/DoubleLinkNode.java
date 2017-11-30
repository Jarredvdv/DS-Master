/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 * @author ogm2
 * @param <E>
 */
public class DoubleLinkNode<E extends Comparable<E>> {
    
    E data;
    DoubleLinkNode next;
    DoubleLinkNode prev;

    public DoubleLinkNode() {
    }

    public DoubleLinkNode(E data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DoubleLinkNode(E data, DoubleLinkNode next, DoubleLinkNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DoubleLinkNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkNode next) {
        this.next = next;
    }

    public DoubleLinkNode getPrevious() {
        return prev;
    }

    public void setPrevious(DoubleLinkNode prev) {
        this.prev = prev;
    }
    
    public void display(){
        System.out.print(data.toString());
    }
    
}
