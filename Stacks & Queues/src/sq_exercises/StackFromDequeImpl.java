/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.*;


public class StackFromDequeImpl<E> 
                            implements MyStackIF<E> {

    MyDequeIF<E> myDeque;

    public StackFromDequeImpl(E[] array) {
        myDeque = new MyDequeImpl<>(array);
    }
    
    @Override
    public void push(E element) throws FullStructureException {
        myDeque.insertLeft(element);
    }

    @Override
    public E pop() throws EmptyStructureException {
        return myDeque.removeLeft();
    }

    @Override
    public E peek() throws EmptyStructureException {
        return myDeque.peekLeft();
    }

    @Override
    public boolean isEmpty() {
        return myDeque.isEmpty();
    }

    @Override
    public boolean isFull() {
        return myDeque.isFull();
    }
    
    public void display() {
        myDeque.display();
    }

}
