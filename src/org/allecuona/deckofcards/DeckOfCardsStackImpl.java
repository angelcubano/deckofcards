package org.allecuona.deckofcards;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by angel on 01/03/16.
 */
public class DeckOfCardsStackImpl implements DeckOfCards{

    private Deque<AbstractCard> cards;

    public DeckOfCardsStackImpl() {
        cards = new ArrayDeque<AbstractCard>() {
        };
    }

    public void createDeckOfCard(){
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                AbstractCard cardAux = new SimpleCard(suit,rank);
                cards.push(cardAux);
            }
        }
    }

    @Override
    public void shuffle() {
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                AbstractCard cardAux = new SimpleCard(suit,rank);
                cards.push(cardAux);
            }
        }
    }


    @Override
    public int getTotalCards() {
        return cards.size();
    }

    @Override
    public boolean hasCard() {
        return !cards.isEmpty();
    }

    @Override
    public Card getFirstCard() {
            return cards.pop();
    }

    @Override
    public Card getLastCard() {
        return cards.removeLast();
    }

}
