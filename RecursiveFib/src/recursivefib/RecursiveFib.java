/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefib;

import java.util.Scanner;

/**
 *This program computes the Fibonacci numbers using a recursive method
 * @author Dimitrios
 */
public class RecursiveFib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
    
    
    for(int i=1; i <= n; i++)
    {
        long f = fib(i);
        System.out.println("fib(" + i + ") = "+ f);
    }
}
    
    public static long fib(int n)
    {
        if(n<=2){return 1;}
        else return fib(n-1) + fib(n-2);
    }
 }
