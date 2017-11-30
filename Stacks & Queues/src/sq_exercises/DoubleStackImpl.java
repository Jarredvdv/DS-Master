/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.EmptyStructureException;
import stacksandqueues.FullStructureException;


public class DoubleStackImpl<E> implements DoubleStackIF<E> {

    E[] array;
    int sizeIn, sizeOut;

    public DoubleStackImpl(E[] array) {
        this.array = array;
    }

    @Override
    public void pushIn(E element) throws FullStructureException {
        if (this.isFull())
            throw new FullStructureException();
        array[sizeIn] = element;
        sizeIn++;
    }

    @Override
    public E popIn() throws EmptyStructureException {
        if (sizeIn == 0)
            throw new EmptyStructureException();
        sizeIn--;
        return array[sizeIn];
    }

    @Override
    public void pushOut(E element) throws FullStructureException {
        if (this.isFull())
            throw new FullStructureException();
        array[array.length - (sizeOut + 1)] = element;
        sizeOut++;
    }

    @Override
    public E popOut() throws EmptyStructureException {
        if (sizeOut == 0)
            throw new EmptyStructureException();
        sizeOut--;
        return array[array.length - (sizeOut + 1)];
    }

    @Override
    public boolean isFull() {
        return ((sizeIn + sizeOut) == array.length);
    }

    @Override
    public void display() {
        System.out.print("IN - ");
        for (int i = 0; i < sizeIn; i++)
            System.out.print(array[i].toString() + " ");
        System.out.println("");
        System.out.print("OUT - ");
        for (int i = 0; i < sizeOut; i++)
            System.out.print(array[array.length - (i + 1)].toString() + " ");
        System.out.println("");
    }

    @Override
    public boolean isEmptyIn() {
        return (sizeIn == 0);
    }

    @Override
    public boolean isEmptyOut() {
        return (sizeOut == 0);
    }

    @Override
    public E peekIn() throws EmptyStructureException {
        if (sizeIn == 0)
            throw new EmptyStructureException();
        return array[sizeIn-1];
    }

    @Override
    public E peekOut() throws EmptyStructureException {
        if (sizeOut == 0)
            throw new EmptyStructureException();
        return array[array.length - sizeOut];
    }
    
}
