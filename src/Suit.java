public class Suit implements Comparable<Suit> {

    Boolean isTrump;
    Boolean isLead;
    String suitName;
    Card[] cards;

    public Suit(String name, Boolean trump, Boolean lead){
        this.isTrump = trump;
        this.isLead = lead;
        this.suitName = name;
        this.cards = new Card[7];

        this.cards[0] = new Card(this, "9");
        this.cards[1] = new Card(this, "10");
        if (this.isTrump) {
            this.cards[2] = new Card(this, "Q");
            this.cards[3] = new Card(this, "K");
            this.cards[4] = new Card(this, "A");
            this.cards[5] = new Card(this, "LJ");
            this.cards[6] = new Card(this, "J");

        } else {
            this.cards[2] = new Card(this, "J");
            this.cards[3] = new Card(this, "Q");
            this.cards[4] = new Card(this, "K");
            this.cards[5] = new Card(this, "A");
            this.cards[6] = null;
        }

    }

    @Override
    public int compareTo(Suit o) {

        //if both are trump
        if (this.isTrump && o.isTrump)
        {
            return 0;
        }
        //if the other is trump and one is not
        else if (!this.isTrump && o.isTrump)
        {
            return -1;
        }
        //if one is trump and the other is not
        else if (this.isTrump)
        {
            return 1;
        }
        //if both are non-trump
        else
        {
            //if both are lead
            if (this.isLead && o.isLead)
            {
                return 0;
            }
            //if the other is lead and one is not
            else if (!this.isLead && o.isLead)
            {
                return -1;
            }
            //if one is lead and the other is not
            else if (this.isLead)
            {
                return 1;
            }
            //if both are not lead
            else
            {
                return 0;
            }
        }
    }
}
