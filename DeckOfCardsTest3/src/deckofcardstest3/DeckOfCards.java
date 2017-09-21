
package deckofcardstest3;

import java.util.Random;

public class DeckOfCards {
    
    Card[] deck;
    int currentCard = 0;
    public static final int NUMBER_OF_CARDS = 52; 
    private static final Random randomNumbers = new Random();
    
    
    public DeckOfCards(){
        
        deck = new Card[ NUMBER_OF_CARDS ];
        
        
       for( Faces f : Faces.values() ){
           for( Suits s : Suits.values() ){
               deck[ currentCard++ ] = new Card( f, s );
           }
       }
       currentCard = 0;
    }
    

    
    
    public void shuffle(){
        currentCard = 0;
        for( int first = 0; first < deck.length ; ++first ){
            
            int second = randomNumbers.nextInt( NUMBER_OF_CARDS);
            
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = deck[first];
        }
    }
    
    public Card dealCard(){
        if( currentCard < deck.length ){
            return deck[ currentCard++ ];
        }
        else{ 
            return null;
        }
    }
}
