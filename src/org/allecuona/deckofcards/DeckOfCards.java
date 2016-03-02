package org.allecuona.deckofcards;

/**
 * Created by angel on 01/03/16.
 */
public interface DeckOfCards {

     void shuffle();

     int getTotalCards();

     boolean hasCard();

     Card getFirstCard();

     Card getLastCard();

}
