/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressioncalculator;

/**
 *
 * @author Dimitrios
 */
public class ExpressionTokenizer
{
    private String input;
    private int start; //The start of the current token
    private int end;   //The position after the end of the current token

/**
 * Constructs a tokenizer.
 * @param anInput the string to tokenize
 */
 public ExpressionTokenizer(String anInput)
 {
     input = anInput;
     start = 0;
     end = 0;
     nextToken(); //Find the first token
 }
 
 /**
  * Peeks at the next toekn without consumingit. 
  * @return the next token or null if there are no more toekns
  */
 public String peekToken()
 {
     if(start >= input.length()) {return null;}
     else { return input.substring(start, end); }
 }
 
 /**
  * Gets the next token and moves the tokenizer to the following tokens
  * @return the next token or null if there are no more tokens
  */
 public String nextToken()
 {
     String r = peekToken();
     start = end;
     if(start>=input.length()) { return r; }
     if(Character.isDigit(input.charAt(start)))
     {
         end = start +1;
         while (end < input.length() && Character.isDigit(input.charAt(end)))
         {
             end++;
         }
     }
     else
     {
         end = start + 1;
     }
     return r;
 }
}
