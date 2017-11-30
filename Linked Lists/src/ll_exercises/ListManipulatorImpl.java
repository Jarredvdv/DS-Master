package ll_exercises;

import java.util.NoSuchElementException;
import linkedlists.*;


public class ListManipulatorImpl<E extends Comparable<E>> 
                                    implements ListManipulatorIF<E> {

    @Override
    public boolean sublist(SingleLinkedListIF<E> l1, SingleLinkedListIF<E> l2) {
        boolean isSublist = false;
        if (l1.isEmpty())
            return true;
        for(int i = 0; i < (this.size(l2) - this.size(l1)); i++) {
            SingleLinkedListIterator<E> iter2
                    = (SingleLinkedListIterator<E>) l2.iterator();
            for (int j = 0; j < i; j++)
                iter2.next();
            isSublist = true;
            SingleLinkedListIterator<E> iter1
                    = (SingleLinkedListIterator<E>) l1.iterator();
            while((isSublist) && (iter1.hasNext())) {
                if(iter1.next().compareTo(iter2.next()) != 0) {
                    isSublist = false;
                }
            }
            if (isSublist)
                return isSublist;
        }
        return isSublist;
    }

    
    public int size(SingleLinkedListIF l) {
        int size = 0;
        if (!(l.isEmpty())) {
            SingleLinkedListIterator<E> iter
                    = (SingleLinkedListIterator<E>) l.iterator();
            while (iter.hasNext()) {
                iter.next();
                size++;
            }
        }
        return size;
    }

    public boolean sameSame(SingleLinkedListIF l1, SingleLinkedListIF l2) {
        SingleLinkedListIterator<E> iter1
                = (SingleLinkedListIterator<E>) l1.iterator();
        SingleLinkedListIterator<E> iter2
                = (SingleLinkedListIterator<E>) l2.iterator();
        while (iter1.hasNext() && iter2.hasNext()) {
            if (iter1.next().compareTo(iter2.next()) != 0) {
                return false;
            }
        }
        return (!(iter1.hasNext() || iter2.hasNext()));
    }
    
    @Override
    public void feed(SingleLinkedListIF l1, SingleLinkedListIF l2) 
                                            throws NoSuchElementException {
        l2.insertFirst(l1.removeFirst());
    }

    @Override
    public void superFeed(SingleLinkedListIF l1, SingleLinkedListIF l2, int n) 
                                            throws NoSuchElementException {
        if(n > this.size(l1))
            throw new NoSuchElementException();
        SingleLinkedListIF<E> ltemp = new SingleLinkedListImpl();
        for (int i = 0; i < n; i++)
            feed(l1, ltemp);
        for (int i = 0; i < n; i++)
            feed(ltemp, l2);
    }

    @Override
    public void shrink(SingleLinkedListIF l, int n, int i) 
                                            throws NoSuchElementException {
        if ((n + i) > this.size(l))
            throw new NoSuchElementException();
        SingleLinkedListIF<E> ltemp = new SingleLinkedListImpl();
        this.superFeed(l, ltemp, i - 1);
        for (int j = 0; j < n; j++)
            l.removeFirst();
        this.superFeed(l, ltemp, this.size(l));
        this.superFeed(ltemp, l, this.size(ltemp));
    }

    @Override
    public SingleLinkedListIF diff(SingleLinkedListIF l1, SingleLinkedListIF l2) {
        SingleLinkedListIF<E> lres = new SingleLinkedListImpl();
        SingleLinkedListIterator<E> iter
                = (SingleLinkedListIterator<E>) l1.iterator();
        while (iter.hasNext()){
            E data = iter.next();
            if (l2.find(data) == -1)
                lres.insertFirst(data);
        }
        return lres;
    }

    @Override
    public int delDiff(SingleLinkedListIF l1, SingleLinkedListIF l2) {
        SingleLinkedListIF<E> ldiff = new SingleLinkedListImpl();
        ldiff = this.diff(l1, l2);
        int result = this.size(l2) - this.size(ldiff);
        SingleLinkedListIF<E> ltemp = new SingleLinkedListImpl();
        while (!(l2.isEmpty())){
            E data = (E) l2.removeFirst();
            if (ldiff.find(data) != -1) {
                ltemp.insertFirst(data);
            }
        }
        while(!(ltemp.isEmpty()))
            l2.insertFirst(ltemp.removeFirst());
        return result;
    }

    @Override
    public void merge(SingleLinkedListIF l1, SortedListIF l2) {
        SingleLinkedListIterator<E> iter
                = (SingleLinkedListIterator<E>) l1.iterator();
        while(iter.hasNext())
            l2.insert(iter.next());
    }

}
