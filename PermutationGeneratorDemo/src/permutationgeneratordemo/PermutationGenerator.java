/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationgeneratordemo;

import java.util.ArrayList;

/**
 * This class generates permutation of a word.
 * @author Dimitrios
 */

public class PermutationGenerator
{
    private String word;
    
    /**
     * Constructs a permutation generator.
     * @param aWord the word to permute
     */
    public PermutationGenerator(String aWord)
    {
        word = aWord;
    }
    
    /**
     * Gets all permutations of a given word.
     */
    public ArrayList<String> getPermutations()
    {
        ArrayList<String> permutations = new ArrayList<String>();
        
        //The empty string has a single permutation: itself
        if (word.length()==0)
        {
            permutations.add(word);
            return permutations;
        }
        
        //Loop throughall character positions
        for (int i=0; i<word.length(); i++)
        {
            //Form a simpler word by removing the ith character
            String shorterWord = word.substring(0,i) + word.substring(i+1);
            
            //Generate all permutations of the simpler word
            PermutationGenerator shorterPermutationGenerator = new PermutationGenerator(shorterWord);
            ArrayList<String> shorterWordPermutations = shorterPermutationGenerator.getPermutations();
            
            
            //Add the removed character to the front of each permutation of the simpler word
            for (String s : shorterWordPermutations)
            {
                permutations.add(word.charAt(i)+s);
            }
        }
        //Return allpermutations
        return permutations;
    }
}
