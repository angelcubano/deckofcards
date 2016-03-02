package org.allecuona.deckofcards;

import java.util.Stack;

/**
 * Created by angel on 01/03/16.
 */
public class DeckOfCardsStackImpl implements DeckOfCards{

    private Stack<AbstractCard> cards;

    public DeckOfCardsStackImpl() {
        cards = new Stack<AbstractCard>();
    }

    public void createDeckOfCard(){

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

    public Stack<AbstractCard> getCards() {
        return cards;
    }

    public void setCards(Stack<AbstractCard> cards) {
        this.cards = cards;
    }

    @Override
    public int getTotalCards() {
        return cards.size();
    }

    @Override
    public boolean hasCard() {
        return !cards.empty();
    }

    @Override
    public Card getCard() {
        return cards.pop();
    }

}
