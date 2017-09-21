/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortdemo;

import java.util.Arrays;

/**
 *
 * @author Dimitrios
 */
public class MergeSortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] a = ArrayUtil.randomIntArray(20,100);
        System.out.println(Arrays.toString(a));
    
        MergeSorter sorter = new MergeSorter(a);
        sorter.sort();
        System.out.println(Arrays.toString(a));
    }
    
}
