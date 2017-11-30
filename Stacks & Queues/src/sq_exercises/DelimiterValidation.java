/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import stacksandqueues.FullStructureException;
import stacksandqueues.EmptyStructureException;
import stacksandqueues.MyStackIF;
import stacksandqueues.MyStackImpl;

/**
 *
 * @author ogm2
 */
public class DelimiterValidation {

    public DelimiterValidation() {
    }

    public void checkFile(String pathname) {
        File f = new File(pathname);
        Scanner sc = null;
        Character[] charr = new Character[1024];
        int line = 0; //number of the line that is being parsed
        MyStackIF<Character> stack = new MyStackImpl<>(charr);
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + pathname);
            System.exit(2);
        }
        System.out.println("Parsing file " + pathname);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            line++;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ((c == '(') || (c == '{') || (c == '[')) {
                    try {
                        stack.push(c);
                    } catch (FullStructureException ex) {
                        System.out.println("Too many delimiters!");
                        System.exit(3);
                    }
                }
                if ((c == ')') || (c == '}') || (c == ']')) {
                    char comp = ' ';
                    try {
                        comp = stack.pop();
                    } catch (EmptyStructureException ex) {
                        System.out.println("Missing match for " + c
                                + " at line " + line);
                        System.exit(0);
                    }
                    switch (comp) {
                        case '(':
                            if (c == ')') {
                                break;
                            }
                        case '[':
                            if (c == ']') {
                                break;
                            }
                        case '{':
                            if (c == '}') {
                                break;
                            }
                        default:
                            System.out.println("Missing match for " + c
                                    + " at line " + line);
                            System.exit(0);
                    }
                }
            }
        }
        System.out.println("This is not the invalid code we're looking for.");
    }
}
