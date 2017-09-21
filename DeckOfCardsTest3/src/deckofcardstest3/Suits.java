
package deckofcardstest3;


public enum Suits {
    HEARTS ( "Hearts" ),
    DIAMONDS ( "Diamonds" ),
    CLUBS ( "Clubs" ),
    SPADES ( "Spades" );
    
    String suit;
    
    private Suits( String suit ){
        this.suit = suit;
    }
    
    public String toString(){
        return suit;
    }
    
}
