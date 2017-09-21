
package deckofcardstest;



public enum DeckFaces {
    ACE ( "Ace" ),
    DEUCE ( "Deuce" ),
    THREE ( "Three" ),
    FOUR ( "Four" ),
    FIVE ( "Five" ), 
    SIX ( "Six" ),
    SEVEN ( "Seven" ),
    EIGHT ( "Eight" ),
    NINE ( "Nine" ),
    TEN ( "Ten" ),
    JACK ( "Jack" ),
    QUEEN ( "Queen" ),
    KING ( "King" );
    
    String face;
    
    
    private DeckFaces( String face ){
        this.face = face;
    }
    
    public String toString(){
        return face; 
    } 
}
