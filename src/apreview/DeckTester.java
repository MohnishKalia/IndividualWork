package apreview;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     * 
     * @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
        Deck bob = new Deck(ranks, suits, values);
        for (int i = 0; i < 9; i++)
            bob.deal();
        System.out.println(bob.toString());
        //System.out.println(bob.toString());
    }
}