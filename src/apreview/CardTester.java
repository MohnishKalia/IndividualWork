package apreview;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     * 
     * @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card bob = new Card("Jack", "Spades", 11);
        Card tom = new Card("Jack", "Spades", 11);
        Card sam = new Card("Queen", "Diamonds", 12);
        System.out.println(bob.matches(tom));
        System.out.println(bob.matches(sam));
        System.out.println(sam.toString());
    }
}