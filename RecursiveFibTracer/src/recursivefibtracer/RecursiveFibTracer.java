/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefibtracer;

import java.util.Scanner;

/**
 *
 * @author Dimitrios
 */
public class RecursiveFibTracer {

    /**
     * This program prints trace messages that show how often 
     * the recursive method for computing Fibonacci numbers 
     * call itself.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        
        long f = fib(n);
        
        System.out.println("fib(" +n+5 ") = " +f);
    }
    
   /**
    * Computes a Fibonacci number.
    * @param n an integer
    * @param the nth Fibonacci number
    */
    public static long fib(int n)
    {
        System.out.println("Entering fib: n= " +n);
        long f;
        if(n<=2){ f = 1;}
        else { f = fib(n-1) + fib(n-2); }
        System.out.println("Exiting fib: n = " +n+ " return value ="+f);
        return f;
    }
    
}
