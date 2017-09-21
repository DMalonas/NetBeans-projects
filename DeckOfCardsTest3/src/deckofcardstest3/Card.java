
package deckofcardstest3;

public class Card {
    
    Faces face;
    Suits suit;
    
    public Card( Faces face, Suits suit ){
        this.face = face;
        this.suit = suit; 
    }
    
    public String toString(){
       return face +  " of " + suit;
    }
}
