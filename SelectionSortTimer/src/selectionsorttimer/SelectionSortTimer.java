/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsorttimer;

import java.util.Scanner;

/**
 *
 * @author Dimitrios
 * 
 * This program measures how long it takes to sort an 
 * array of a user-specified size with the selection
 * sort algorithm
 */
public class SelectionSortTimer 
{
   public static void main(String[] args) 
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter an array size: ");
       int n = in.nextInt();
       
       
       //Construct random array
       
       int[] = ArrayUtil.randomIntArray(n,100);
       SelectionSorter sorter = new SelectionSorter(a);
       
       
       //use stopwatch to time selection sort
       
       StopWatch timer = new StopWatch();
       
       
       timer.start();
       timer.sort();
       timer.stop();
       
       System.out.println("Elapsed timee: " + timer.getElapsedTime() + " milliseconds");
   }
}


