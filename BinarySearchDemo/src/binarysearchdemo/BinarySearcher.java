/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchdemo;

/**
 *
 * @author Dimitrios
 */
public class BinarySearcher 
{
    private int[] a;
    
    
    public BinarySearcher(int[] anArray)
    {
        a = anArray;
    }
    
    public int search(int v)
    {
        int low = 0;
        int high = a.length - 1;
        while(low <= high)
        {
            int mid =(low + high) / 2;
            int diff = a[mid] - v;
            
            if(0 == diff) 
                return mid;
            else if(diff<0)
                low = mid +1;
            else
                high = mid -1;
        }
        return -1;
    }
}
