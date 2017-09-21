/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortdemo;

/**
 *
 * @author Dimitrios
 */
public class MergeSorter 
{
    private int[] a;
    /**
     * constructs a merge sorter.
     * @param anArray the array to sort
     */
    public MergeSorter(int[] anArray)
    {
        a = anArray;
    }
    
    /**
     * sorts the array managed by this merge sorter
     */
    public void sort()
    {
        if(a.length <=1)return;
        int[] first = new int[a.length/2];
        int[] second = new int[a.length - first.length];
        //Copy the first half of a into first, the second half into second
        for (int i=0; i< first.length; i++) {first[i] = a[i];}
        for (int i=0; i< second.length; i++)
        {
            second[i] = a[first.length + i];
        }
            MergeSorter firstSorter = new MergeSorter(first);
            MergeSorter secondSorter = new MergeSorter(second);
            firstSorter.sort();
            secondSorter.sort();
            merge(first,second);
        
    }
        /**
         * Merges two sorted arrays into the array managed by this merge sorter.
         * @param fisrt the first sorted array
         * @param second the second sorted array
         */
        private void merge(int[] first, int[] second)
        {
            int iFirst =0;
            int iSecond = 0;
            int j = 0;
        
            
            while(iFirst < first.length && iSecond<second.length)
            {
                if(first[iFirst] < second[iSecond])
                {
                    a[j] = first[iFirst];
                    iSecond++;
                }
                j++;
            }
            
            
            while(iFirst < first.length)
            {
                a[j] = second[iSecond];
                iSecond++; j++;
            }
        }
        
}