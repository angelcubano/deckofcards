package org.allecuona.deckofcards;

/**
 * Created by angel on 01/03/16.
 */
public class SimpleCard extends AbstractCard {

    public SimpleCard(Suits suits, Ranks ranks) {
        super(suits, ranks);
    }

    @Override
    public int compareTo(Object obj) {
        SimpleCard simpleCard = (SimpleCard) obj;

        if(this.getRank().equals(Ranks.ACE))
            this.getRank().setValue(14);
        if(simpleCard.getRank().equals(Ranks.ACE))
            simpleCard.getRank().setValue(14);

        return this.getRank().getValue() - simpleCard.getRank().getValue();
    }

}