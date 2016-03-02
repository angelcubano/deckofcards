package org.allecuona.deckofcards;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by angel on 01/03/16.
 */
public class DeckOfCardsListImpl implements DeckOfCards {

    private List<AbstractCard> cards;

    private int currentCard;

    public DeckOfCardsListImpl() {
        cards = new ArrayList<AbstractCard>();
        currentCard = 0;
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

    public int getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(int currentCard) {
        this.currentCard = currentCard;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public int getTotalCards() {
        return cards.size() - currentCard;
    }

    @Override
    public boolean hasCard() {
        return currentCard < cards.size();
    }

    @Override
    public Card getCard() {
        if (!cards.isEmpty()) {
            return cards.get(currentCard++);
        }
        return null;
    }

}
