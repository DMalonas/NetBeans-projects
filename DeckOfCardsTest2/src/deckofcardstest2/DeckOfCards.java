
package deckofcardstest2;

import java.util.Random;

public class DeckOfCards {
   private static final int NUMBER_OF_CARDS = 52; 
   private int currentCard = 0;
   private Card[] deck = new Card[NUMBER_OF_CARDS];
   private static final Random randomNumbers = new Random();    
   
   Random randomCards = new Random();   
   
    //create 
    public DeckOfCards(){
       
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", 
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        
        
        for( int counter = 0; counter < deck.length; ++counter ){
            deck[ counter ] = new Card( faces[ counter % 13 ], suits[ counter / 13 ] );
        }
    }
    
    //shuffle
    public void shuffle(){
        

        for( int first = 0; first < NUMBER_OF_CARDS; ++first ){
            
            int second = randomNumbers.nextInt( NUMBER_OF_CARDS );
            
            Card temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ]  = temp; 
        }
    }
    
    
    public Card dealCard(){
        
        if( currentCard < deck.length )
            return deck[ currentCard ++ ];
        else
            return null;
    }
}
