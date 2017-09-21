
package deckofcardstest2;

public class Card {
    
   private String face, suit;
   
   public Card( String face, String suit ){
       this.face = face;
       this.suit = suit;
   }
   
   public String toString(){
       return face + " of " + suit;
   }
}
