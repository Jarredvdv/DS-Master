/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import java.util.Random;
import stacksandqueues.*;

/**
 *
 * @author ogm2
 */
public class StacksAndQueuesLauncher {

    public static final int SIZE = 12;

    public StacksAndQueuesLauncher() {
    }
    
    
    public void testStack(){
        Integer[] array = new Integer[SIZE];
        int i;
        Random rd = new Random();
        
        System.out.println("\n\nSTACK TIME");
        for (i = 0; i < SIZE; i++)
            array[i] = 0;
        MyStackIF<Integer> myStack = new MyStackImpl<>(array);
        try {
            myStack.push(rd.nextInt(101));
            myStack.push(rd.nextInt(101));
            myStack.push(rd.nextInt(101));
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myStack.display();
        try{
            System.out.println("Popping " + myStack.pop());
            System.out.println("Popping " + myStack.pop());
            myStack.display();
            System.out.println("Popping " + myStack.pop());
        } catch (EmptyStructureException e) {
            e.printStackTrace();            
        }        
    }
    
    
    public void testQueue(){
        Integer[] array = new Integer[SIZE];
        int i;
        Random rd = new Random();
        
        System.out.println("\n\nQUEUE TIME");
        for (i = 0; i < SIZE; i++)
            array[i] = 0;
        MyQueueIF<Integer> myQueue = new MyQueueImpl<>(array);
        try {
            for (i = 0; i < SIZE; i++) {
                int n = rd.nextInt(101);
                System.out.println("Queueing "+n);
                myQueue.enqueue(n);                
            }
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myQueue.display();
        try{
            System.out.println("Dequeuing " + myQueue.dequeue());
            System.out.println("Peeking " + myQueue.peek());
            System.out.println("Dequeuing " + myQueue.dequeue());            
            myQueue.display();
            System.out.println("Dequeuing " + myQueue.dequeue());
        } catch (EmptyStructureException e) {
            e.printStackTrace();            
        }
        myQueue.display();
        try {
            myQueue.enqueue(rd.nextInt(101));
            myQueue.enqueue(rd.nextInt(101));
            myQueue.enqueue(rd.nextInt(101));
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myQueue.display();
    }
    
    public void testPriorityQueue(){
        Integer[] array = new Integer[SIZE];
        int i;
        Random rd = new Random();
        
        System.out.println("\n\nPRIORITY QUEUE TIME");
        for (i = 0; i < SIZE; i++)
            array[i] = 0;
        MyPriorityQueueIF<Integer> myQueue = new MyPriorityQueueImpl<>(array);
        try {
            for (i = 0; i < SIZE; i++) {
                int n = rd.nextInt(101);
                System.out.println("Queueing ("+i+","+n+")");
                myQueue.insert(n, i);                
            }
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myQueue.display();
        try{
            System.out.println("Dequeuing " + myQueue.remove());
            System.out.println("Peeking " + myQueue.peek());
            System.out.println("Dequeuing " + myQueue.remove());            
            myQueue.display();
            System.out.println("Dequeuing " + myQueue.remove());
        } catch (EmptyStructureException e) {
            e.printStackTrace();            
        }
        myQueue.display();
        try {
            for (i = 0; i < 3; i++) {
                int v = rd.nextInt(101);
                int k = rd.nextInt(12);
                myQueue.insert(v, k);
                System.out.println("Queueing ("+k+","+v+")");
            }
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myQueue.display();
    }
    
    private void testDeque() {
        Integer[] array = new Integer[SIZE];
        int i;
        Random rd = new Random();
        
        System.out.println("\n\nQUEUE TIME");
        for (i = 0; i < SIZE; i++)
            array[i] = 0;
        MyDequeIF<Integer> myDeque = new MyDequeImpl<>(array);
        try {
            for (i = 0; i < SIZE; i++) {
                int n = rd.nextInt(101);
                System.out.println("Inserting "+n);
                if (n % 2 == 0)
                    myDeque.insertLeft(n);
                else
                    myDeque.insertRight(n);
            }
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myDeque.display();
        try{
            System.out.println("Removing left " + myDeque.removeLeft());
            System.out.println("Peeking left " + myDeque.peekLeft());
            System.out.println("Peeking right " + myDeque.peekRight());
            System.out.println("Removing right " + myDeque.removeRight());            
            myDeque.display();
            System.out.println("Removing right " + myDeque.removeRight());
        } catch (EmptyStructureException e) {
            e.printStackTrace();            
        }
        myDeque.display();
        try {
            myDeque.insertRight(rd.nextInt(101));
            myDeque.insertRight(rd.nextInt(101));
            myDeque.insertRight(rd.nextInt(101));
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myDeque.display();
    }
    
    
    private void testArithmeticEvaluator() {
        System.out.println("\n\nARITHMETIC EXPRESSION TIME");
        String expr1 = "(1+((2+3)*(4*5)))";
        String expr2 = "(8-(6/2))";
        String expr3 = "(1+(2*(3-(4/(5+6)))))";
        String expr4 = "(((((9+8)*7)-6)/5)+4)";
        ArithmeticExpressionEvaluator evaluator = 
                    new ArithmeticExpressionEvaluator();
        double d = evaluator.evaluateArithmeticExpression(expr1);
        System.out.println(expr1 + " = " + d);
        d = evaluator.evaluateArithmeticExpression(expr2);
        System.out.println(expr2 + " = " + d);
        d = evaluator.evaluateArithmeticExpression(expr3);
        System.out.println(expr3 + " = " + d);
        d = evaluator.evaluateArithmeticExpression(expr4);
        System.out.println(expr4 + " = " + d);
    }

    
    public void testQueueFromDeque(){
        Integer[] array = new Integer[SIZE];
        int i;
        Random rd = new Random();
        
        System.out.println("\n\nQUEUE FROM DEQUE TIME");
        for (i = 0; i < SIZE; i++)
            array[i] = 0;
        MyQueueIF<Integer> myQueue = new QueueFromDequeImpl<>(array);
        try {
            for (i = 0; i < SIZE; i++) {
                int n = rd.nextInt(101);
                System.out.println("Enqueueing "+n);
                myQueue.enqueue(n);
            }
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myQueue.display();
        try{
            System.out.println("Dequeuing " + myQueue.dequeue());
            System.out.println("Dequeuing " + myQueue.dequeue());
            myQueue.display();
            System.out.println("Peeking " + myQueue.peek());
            System.out.println("Dequeuing " + myQueue.dequeue());
        } catch (EmptyStructureException e) {
            e.printStackTrace();            
        }
    }
    
    public void testDelimiterMatching() {
        System.out.println("\n\nDELIMITER MATCHING TIME");
        DelimiterValidation dv = new DelimiterValidation();
        //You'll need to adapt the pathnames
        String myFilepath = "/Users/ogm2/Downloads/MyStackImpl.java";
        dv.checkFile(myFilepath);
        myFilepath = "/Users/ogm2/Downloads/MyInvalidStackImpl.java";
        dv.checkFile(myFilepath);
    }

    public void testDoubleStack() {
        Integer[] array = new Integer[SIZE];
        int i;
        Random rd = new Random();
        
        System.out.println("\n\nDOUBLE STACK TIME");
        for (i = 0; i < SIZE; i++)
            array[i] = 0;
        DoubleStackIF<Integer> dStack = new DoubleStackImpl<>(array);
        try {
            for (i = 0; i < (SIZE/2); i++) {
                dStack.pushIn(rd.nextInt(101));
                dStack.pushOut(rd.nextInt(101));
            }
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        dStack.display();
        try{
            System.out.println("Popping from Out " + dStack.popOut());
            System.out.println("Popping from In " + dStack.popIn());
            dStack.display();
            System.out.println("Popping from In " + dStack.popIn());
            dStack.display();
        } catch (EmptyStructureException e) {
            e.printStackTrace();            
        }        
    }

    public void testTwoStackQueue() {
        Integer[] array = new Integer[SIZE];
        int i;
        Random rd = new Random();
        
        System.out.println("\n\nQUEUE TIME");
        for (i = 0; i < SIZE; i++)
            array[i] = 0;
        MyQueueIF<Integer> myQueue = new MyTwoStackQueueImpl<>(array);
        try {
            for (i = 0; i < SIZE; i++) {
                int n = rd.nextInt(101);
                System.out.println("Queueing "+n);
                myQueue.enqueue(n);                
            }
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myQueue.display();
        try{
            System.out.println("Dequeuing " + myQueue.dequeue());
            System.out.println("Peeking " + myQueue.peek());
            System.out.println("Dequeuing " + myQueue.dequeue());            
            myQueue.display();
            System.out.println("Dequeuing " + myQueue.dequeue());
        } catch (EmptyStructureException e) {
            e.printStackTrace();            
        }
        myQueue.display();
        try {
            myQueue.enqueue(rd.nextInt(101));
            myQueue.enqueue(rd.nextInt(101));
            myQueue.enqueue(rd.nextInt(101));
        } catch (FullStructureException e) {
            e.printStackTrace();
        }
        myQueue.display();
        
    }
    
    public void testHollywood(){
        //You'll need to adapt the pathname
        String pathname = "/Users/ogm2/Downloads/hollywood.txt";
        AgesOfHollywood aoh = new AgesOfHollywood();
        aoh.parseTextFile(pathname);
    }
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StacksAndQueuesLauncher launcher = new StacksAndQueuesLauncher();
//        launcher.testQueue();
//        launcher.testStack();
//        launcher.testPriorityQueue();
//        launcher.testDeque();
//        launcher.testArithmeticEvaluator();
//        launcher.testQueueFromDeque();
//        launcher.testDelimiterMatching();
//        launcher.testDoubleStack();
//        launcher.testTwoStackQueue();
        launcher.testHollywood();
    }

    
}
