
package deckofcardstest;


public class DeckOfCardsTest {

    public static void main(String[] args) {
        
       
        
        DeckOfCards myDeckOfCards = new DeckOfCards();

        //  for (DeckSuits s : DeckSuits.values()){
 
 // new Card(f.face, s.suit);

           myDeckOfCards.shuffle();
            for( int i = 1; i <= 52; ++i ){
                System.out.printf( "%-19s", myDeckOfCards.dealCard() );        
                if ( 0 == i % 5 )
                    System.out.println();       
            }
   
    }
}
