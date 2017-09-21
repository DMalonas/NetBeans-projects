
package deckofcardstest4;

import java.util.Random;


public class DeckOfCards {
    
    private Card deck[]; 
    private static final int NUMBER_OF_CARDS = 52;
    private int currentCard = 0;
    private static final Random randomNumbers = new Random();
    
    public DeckOfCards(){
        
        deck = new Card[NUMBER_OF_CARDS];
    
        for( Faces f : Faces.values() ){
            for ( Suits s : Suits.values() ){
                deck[ currentCard++ ] =  new Card( f, s );
            }
        }
        currentCard = 0;
    }
    
    
    
    public void shuffle(){
       
        for( int first = 0; first < deck.length; ++first ){
            int second = randomNumbers.nextInt(52);
            
            Card temp = deck[ first ];
            deck [ first ] = deck [ second ];
            deck [ second ] = deck [ first ];
        }
    }
    
    public Card dealCard(){
       return (currentCard < deck.length) ? deck[ currentCard++ ] : null;
    }
    
}
