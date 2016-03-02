package org.allecuona.deckofcards;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by angel on 01/03/16.
 */
public class DeckOfCardsListImpl implements DeckOfCards {

    private List<AbstractCard> cards;

    public DeckOfCardsListImpl() {
        cards = new LinkedList<AbstractCard>();
        this.createDeckOfCard();
    }

    private void createDeckOfCard(){
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                AbstractCard cardAux = new SimpleCard(suit,rank);
                cards.add(cardAux);
            }
        }
    }

    public List<AbstractCard> getCards() {
        return cards;
    }

    public void setCards(List<AbstractCard> cards) {
        this.cards = cards;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
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
        return cards.get(0);
    }

    @Override
    public Card getLastCard() {
        return cards.get(cards.size() - 1);
    }

    public Card getCard(int position) {
        return cards.get(position);
    }


}
