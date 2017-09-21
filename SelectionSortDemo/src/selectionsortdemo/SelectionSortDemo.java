/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsortdemo;

import java.util.Arrays;

/**
 *
 * @author Dimitrios
 * 
 * This program demonstrates the selection sort algorithm by 
 * sorting an array that is filled with random numbers.
 */
public class SelectionSortDemo 
{
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20,100);
        System.out.println(Arrays.toString(a));
        
        SelectionSorter sorter = new SelectionSorter(a);
        sorter.sort();
        
        System.out.println(Arrays.toString(a));
    }
}
