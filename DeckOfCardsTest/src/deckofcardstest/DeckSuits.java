

package deckofcardstest;

public enum  DeckSuits {
    HEARTS ( "Hearts" ),
    DIAMONDS ( "Diamonds" ),
    CLUBS ( "Clubs" ),
    SPADES ( "Spades" );
    
    String suit;
    
    
    private DeckSuits( String suit ){
        this.suit = suit;
    }
    
    public String toString(){
        return suit; 
    } 
}