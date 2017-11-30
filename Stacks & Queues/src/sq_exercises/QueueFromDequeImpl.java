/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.*;

/**
 *
 * @author ogm2
 */
public class QueueFromDequeImpl<E> implements MyQueueIF<E> {

    MyDequeIF<E> myDeque;

    public QueueFromDequeImpl(E[] array) {
        myDeque = new MyDequeImpl<>(array);
    }
    

    @Override
    public void enqueue(E element) throws FullStructureException {
        myDeque.insertRight(element);
    }

    @Override
    public E dequeue() throws EmptyStructureException {
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

    @Override
    public void display() {
        myDeque.display();
    }
    
}
