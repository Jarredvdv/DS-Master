/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import stacksandqueues.*;

/**
 *
 * @author ogm2
 */
public class AgesOfHollywood {
    
    MyPriorityQueueIF<HollywoodCelebrity> pq;

    public AgesOfHollywood() {
        int SIZE = 128;
        HollywoodCelebrity[] array = new HollywoodCelebrity[SIZE];
        for (int i = 0; i < SIZE; i++)
            array[i] = null;
        pq = new MyPriorityQueueImpl<>(array);
    }
    
    public void parseTextFile(String pathname) {
        File f = new File(pathname);
        Scanner sc = null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + pathname);
            System.exit(2);
        }
        System.out.println("Parsing file " + pathname);
        while (sc.hasNextLine()) {
            String s1 = sc.next();
            String s2 = sc.next();
            int year = sc.nextInt();
            try {
                pq.insert(new HollywoodCelebrity(s1, s2, year), year);
            } catch (FullStructureException ex) {
                ex.printStackTrace();
            }
        }
        pq.display();

    }
    
    
    
}
