package org.allecuona.deckofcards;


/**
 * Created by angel on 01/03/16.
 */
public abstract class AbstractCard implements Card {

    private Suits suit;

    private Ranks rank;


    public AbstractCard(Suits suits, Ranks ranks) {
        this.suit = suits;
        this.rank = ranks;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    @Override
    public Suits getSuit() {
        return suit;
    }

    @Override
    public Ranks getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCard)) return false;

        AbstractCard that = (AbstractCard) o;

        if (getSuit() != that.getSuit()) return false;
        return getRank() == that.getRank();

    }

    @Override
    public int hashCode() {
        int result = getSuit().hashCode();
        result = 31 * result + getRank().hashCode();
        return result;
    }
}
