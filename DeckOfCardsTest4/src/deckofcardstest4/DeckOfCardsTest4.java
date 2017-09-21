
package deckofcardstest4;

public class DeckOfCardsTest4 {

    public static void main(String[] args) {
        
        DeckOfCards m = new DeckOfCards();
        
        m.shuffle();
        
        for( int i = 1; i <= 52; ++i ){
            System.out.printf("%-19s", m.dealCard() );
            if( i%4 == 0 )
                System.out.println();
        }
    
    }
    
}
