/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 * SingleLinkNode provides instances of links that can be inserted in a 
 * single linked list.
 * It contains a data element of type E that implements Comparable and a
 * reference to its successor in the list.
 * @author ogm2
 */
public class SingleLinkNode<E extends Comparable<E>> {
    
    E data;
    SingleLinkNode next;

    public SingleLinkNode() {
        this.data = null;
        this.next = null;
    }

    public SingleLinkNode(E data) {
        this.data = data;
        this.next = null;
    }

    public SingleLinkNode(E data, SingleLinkNode next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public SingleLinkNode getNext() {
        return next;
    }

    public void setNext(SingleLinkNode next) {
        this.next = next;
    }
    
    public void display(){
        System.out.print(data.toString());
    }

}
