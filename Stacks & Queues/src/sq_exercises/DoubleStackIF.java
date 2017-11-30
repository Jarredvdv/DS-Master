/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.EmptyStructureException;
import stacksandqueues.FullStructureException;

/**
 *
 * @author ogm2
 */
public interface DoubleStackIF<E> {
    
    public void pushIn(E element) throws FullStructureException;

    public E popIn() throws EmptyStructureException;

    public E peekIn() throws EmptyStructureException;

    public boolean isEmptyIn();

    public void pushOut(E element) throws FullStructureException;

    public E popOut() throws EmptyStructureException;

    public E peekOut() throws EmptyStructureException;

    public boolean isEmptyOut();

    public boolean isFull();

    public void display();
    
}
