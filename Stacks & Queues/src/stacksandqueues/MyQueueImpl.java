package stacksandqueues;


public class MyQueueImpl<E> implements MyQueueIF<E> {

    int head;
    int tail;
    int size;
    E[] array;

    
    public MyQueueImpl(E[] array) {
        this.array = array;
        tail = 0;
        head = 0;
    }
    
    @Override
    public void enqueue(E element) throws FullStructureException {
        if (this.isFull())
            throw new FullStructureException();
        array[head] = element;
        head = (head + 1) % array.length;
        size++;        
    }

    @Override
    public E dequeue() throws EmptyStructureException {
        int index;
        if (this.isEmpty())
            throw new EmptyStructureException();
        index = tail;
        tail = (tail + 1) % array.length;
        size--;
        return array[index];
    }

    @Override
    public E peek() throws EmptyStructureException {
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
            i = (head + array.length - 1) % array.length;
            do {
                System.out.print(array[i]+" ");
                i = (i + array.length - 1) % array.length;
            } while (i != (tail + array.length - 1) % array.length);
        }
        System.out.println("");
    }
    
}
