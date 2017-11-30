/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.*;

/**
 *
 * @author ogm2
 */
public class ArithmeticExpressionEvaluator {

    public ArithmeticExpressionEvaluator() {
    }

    public Double evaluateArithmeticExpression(String s) {
        Double result = null;
        Character[] charray = new Character[s.length()];
        for (int i = 0; i < charray.length; i++) {
            charray[i] = ' ';
        }
        MyStackIF<Character> ops = new MyStackImpl<>(charray);
        Double[] darray = new Double[s.length()];
        for (int i = 0; i < darray.length; i++) {
            darray[i] = 0.0;
        }
        MyStackIF<Double> vals = new MyStackImpl<>(darray);
        try {
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (c.equals('(')) {
                    //Do nothing
                } else if (c.equals('+') || c.equals('*') 
                        || c.equals('-') || c.equals('/')) {
                    ops.push(c);
                } else if (c.equals(')')) {
                    Character op = ops.pop();
                    double v1 = vals.pop();
                    double v2 = vals.pop();
                    if (op.equals('+')) {
                        vals.push(v2 + v1);
                    } else if (op.equals('*')) {
                        vals.push(v2 * v1);
                    } else if (op.equals('-')) {
                        vals.push(v2 - v1);
                    } else if (op.equals('/')) {
                        vals.push(v2 / v1);
                    }
                } else {
                    vals.push(Double.valueOf(s.substring(i, i+1))); 
                }
            }
            result = vals.pop();
        } catch (EmptyStructureException | FullStructureException e) {
            e.printStackTrace();
        }
        return result;
    }
}
