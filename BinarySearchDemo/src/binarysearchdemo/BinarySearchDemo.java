/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchdemo;


import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Dimitrios
 * 
 * this program demonstrates the binary search algorithm
 */

public class BinarySearchDemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] a = ArrayUtil.randomIntArray(20,100);
        System.out.println(Arrays.toString(a));
        BinarySearcher searcher = new BinarySearcher(a);
        
        Scanner in = new Scanner(System.in);
        
        boolean done = false;
        
        while(!done)
        {
            System.out.print("Enter number to search for, -1 to quit: ");
            int n = in.nextInt();
            if(-1 == n)
                done = true;
            else
            {
                int pos = searcher.search(n);
                System.out.println("Found in position: " + pos);
            }
        }
    }
}
