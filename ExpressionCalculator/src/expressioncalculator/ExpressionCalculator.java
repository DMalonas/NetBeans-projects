/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressioncalculator;

import java.util.Scanner;

/**
 *
 * @author Dimitrios
 * 
 * This program calculates the value of an expression
 * consisting of numbers, arithmetic operators and parentheses.
 */
public class ExpressionCalculator {

   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String input = in.nextLine();
        Evaluator e = new Evaluator(input);
        int value = e.getExpressionValue();
        System.out.println(input + "=" +value);
    }
}
