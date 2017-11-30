/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues;


public class MyDequeImpl<E> implements MyDequeIF<E> {

    int head;
    int tail;
    int size;
    E[] array;

    
    public MyDequeImpl(E[] array) {
        this.array = array;
        tail = 0;
        head = 0;
    }
    

    @Override
    public void insertLeft(E element) throws FullStructureException {
        if (this.isFull())
            throw new FullStructureException();
        if (!(this.isEmpty()))
            head = (head + array.length - 1) % array.length;
        array[head] = element;
        size++;
    }

    @Override
    public E removeLeft() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        E elt = array[head];
        size--;
        if (!(this.isEmpty()))
            head = (head + 1) % array.length;
        return elt;
    }

    @Override
    public E peekLeft() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        return array[head];
    }

    @Override
    public void insertRight(E element) throws FullStructureException {
        if (this.isFull())
            throw new FullStructureException();
        if (!(this.isEmpty()))
            tail = (tail + 1) % array.length;
        array[tail] = element;
        size++;
    }

    @Override
    public E removeRight() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        E elt = array[tail];
        size--;
        if (!(this.isEmpty()))
            tail = (tail + array.length - 1) % array.length;
        return elt;
    }

    @Override
    public E peekRight() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        return array[tail];
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean isFull() {
        return (size == array.length);
    }

    public void display(){
        int i;
        if (!(this.isEmpty())){
            i = head;
            while (i != tail) {
                System.out.print(array[i]+" ");
                i = (i + 1) % array.length;
            }
        }
        System.out.println(array[tail]+"");
    }    
}
