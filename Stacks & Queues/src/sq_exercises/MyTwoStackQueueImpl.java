/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import java.util.logging.Level;
import java.util.logging.Logger;
import stacksandqueues.*;

/**
 *
 * @author ogm2
 */
public class MyTwoStackQueueImpl<E> implements MyQueueIF<E> {

    DoubleStackIF<E> stack;

    public MyTwoStackQueueImpl(E[] array) {
        stack = new DoubleStackImpl<>(array);
    }
    
    @Override
    public void enqueue(E element) throws FullStructureException {
        if (stack.isFull()) {
            if (stack.isEmptyOut())
                while (!(stack.isEmptyIn())) {
                    try {
                        stack.pushOut(stack.popIn());
                    } catch (EmptyStructureException ex) {
                        ex.printStackTrace();
                    }
                }
            else
                throw new FullStructureException();
        }
        stack.pushIn(element);
    }

    @Override
    public E dequeue() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        if (stack.isEmptyOut()) {
            while(!(stack.isEmptyIn()))
                try {
                    stack.pushOut(stack.popIn());
                } catch (FullStructureException ex) {
                    ex.printStackTrace();
                }
        }
        return stack.popOut();
    }

    @Override
    public E peek() throws EmptyStructureException {
        return stack.peekOut();
    }

    @Override
    public boolean isEmpty() {
        return (stack.isEmptyIn() && stack.isEmptyOut());
    }

    @Override
    public boolean isFull() {
        return stack.isFull();
    }

    @Override
    public void display() {
        stack.display();
    }
    
}
