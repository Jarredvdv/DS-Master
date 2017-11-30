/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues;


public class MyPriorityQueueImpl<E> implements MyPriorityQueueIF<E> {

    int size;
    E[] array;
    int[] priorities;

    public MyPriorityQueueImpl(E[] array) {
        this.array = array;
        size = 0;
        priorities  = new int[array.length];
    }
    
    @Override
    public void insert(E element, int prio) throws FullStructureException {
        int i = 0;
        int j = size;
        if (this.isFull())
            throw new FullStructureException();
        while ((i < size) && (prio > this.priorities[i])) {
            i++;
        }
        while (j > i) {
            this.array[j] = this.array[j-1];
            this.priorities[j] = this.priorities[j-1];
            j--;
        }
        this.array[i] = element;
        this.priorities[i] = prio;
        this.size++;
    }

    @Override
    public E remove() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        size--;
        return this.array[size];
    }

    @Override
    public E peek() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        return this.array[size-1];
    }

    @Override
    public boolean isEmpty() {
        return (this.size == 0);
    }

    @Override
    public boolean isFull() {
        return (this.size == this.array.length);
    }
    
    @Override
    public void display(){
        for (int i = 0; i < size; i++)
            System.out.print("(" + priorities[i] + ","
                            + array[i].toString() + ") ");
        System.out.println("");
    }
}
