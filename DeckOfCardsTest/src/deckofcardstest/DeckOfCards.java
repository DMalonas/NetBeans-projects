
package deckofcardstest;

import java.util.Random;


public class DeckOfCards {

    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();
    
    public DeckOfCards(){
        

        deck = new Card[ NUMBER_OF_CARDS ];
        currentCard = 0;
        
       // for( int count = 0; count < deck.length; ++count )
         //   
           //         new Card( faces[ count % 13 ], suits[ count / 13 ] );
   
        for (DeckSuits s : DeckSuits.values()){
            for (DeckFaces f : DeckFaces.values()){
                deck[ currentCard++ ] =  new Card(f.face, s.suit);
            }
        }
        currentCard = 0;
   
    }
              
    public void shuffle(){
        currentCard = 0;
        for( int first = 0; first < deck.length; ++first ){
            int second = randomNumbers.nextInt( NUMBER_OF_CARDS );
            
            Card temp = deck[ first ];
            deck[ first ] =  deck[ second ];
            deck[ second ] = temp;
        }
    }
    
    public Card dealCard(){
        
        if( currentCard < deck.length ){
            return deck[ currentCard++ ];
        }
        else
            return null;
    }
    

    
   
    
}
