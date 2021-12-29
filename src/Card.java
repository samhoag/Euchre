public class Card implements Comparable<Card>{
    //To compare cards, take the name and get the int as value. For trump, do +10 or something to each value to ensure that it wins each time


    Suit suit;
    String name;

    public Card(Suit suit, String name){
        this.suit = suit;
        this.name = name;
    }

    public Suit getSuit(){
        return this.suit;
    }

    @Override
    public int compareTo(Card o) {
        //compares suit. If this card is trump or lead and the other is not, this card is greater
        if (this.suit.compareTo(o.suit) > 0)
        {
            return 1;
        }
        //inverse of previous
        else if (this.suit.compareTo(o.suit) < 0)
        {
            return -1;
        }
        //both suits are either trump, lead, or both. Now cards are compared. It is assumed that no two cards are equal at this point.
        else
        {
            //iterates over all cards in this suit
            for (int i = 0; i < 7; i++)
            {
                //Linear searches the array from 0 to 7 for the other card. If it is found, this card is higher.
                if (this.suit.cards[i].name.equals(o.name))
                {
                    return 1;
                }
                //If the other card is not found at this index, this card is checked for at this index. If it is found, the other card is higher.
                else if (this.suit.cards[i].name.equals(this.name))
                {
                    return -1;
                }


            }
            //0 should never be returned.
            return 0;
        }
    }
}

