import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class Main {
    /*
     * All cards specified by initials in format Value-Suit. For instance, the 9 of Hearts is 9H and the Queen of Hearts is QH. 10 of Hearts is 10H
     */


    public static void main(String[] args) {

        String[] deck = new String[]{"9C", "10C", "JC", "QC", "KC", "AC", "9D", "10D", "JD", "QD", "KD", "AD", "9H", "10H", "JH", "QH", "KH", "AH", "9S", "10S", "JS", "QS", "KS", "AS"};
        String[][] deckBySuit = new String[][]{
            {"9C", "10C", "JC", "QC", "KC", "AC"}, //Clubs    (0)
            {"9D", "10D", "JD", "QD", "KD", "AD"}, //Diamonds (1)
            {"9H", "10H", "JH", "QH", "KH", "AH"}, //Hearts   (2)
            {"9S", "10S", "JS", "QS", "KS", "AS"}};//Spades  (3)

        String[] shuffledDeck = deck;
        shuffleArray(shuffledDeck);

        String[][] dealt = new String[][]{
                {shuffledDeck[0], shuffledDeck[1], shuffledDeck[2], shuffledDeck[3], shuffledDeck[4]},
                {shuffledDeck[5], shuffledDeck[6], shuffledDeck[7], shuffledDeck[8], shuffledDeck[9]},
                {shuffledDeck[10], shuffledDeck[11], shuffledDeck[12], shuffledDeck[13], shuffledDeck[14]},
                {shuffledDeck[15], shuffledDeck[16], shuffledDeck[17], shuffledDeck[18], shuffledDeck[19]},
        };

        String flipped = shuffledDeck[20];

        for (int i = 0; i < dealt.length; i++)
        {
            System.out.println("Hand " + i);
            for (int x = 0; x < dealt[i].length; x++)
            {
                System.out.println(dealt[i][x]);
            }
        }

    }

    static String[] shuffleArray(String[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }





}
