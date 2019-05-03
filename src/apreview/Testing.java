package apreview;
import java.util.ArrayList;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        // BinaryInt bob = new BinaryInt();
        // bob.setBin(2314279623);
        // System.out.println(bob.getString());
        // System.out.println(bob.addBin(3236550123));
        // System.out.println(bob.compareBin(101));
        // y=2x2 - 6x - 5
        Quadratic q1 = new Quadratic(
                new ArrayList<Monomial>(Arrays.asList(new Monomial(2, 2), new Monomial(-6, 1), new Monomial(-5, 0))));
        // y = 4x2 + 2x - 3
        Quadratic q2 = new Quadratic(new ArrayList<Monomial>(Arrays.asList(new Monomial(4, 2), new Monomial(2, 1))));
        System.out.println(q1.getName() + " : " + q2.getName());
        System.out.println("=======================");

        for (double s : q1.getRoots()) {
            System.out.println(s);
        }
        System.out.println("=======================");
        for (double s : q2.getRoots()) {
            System.out.println(s);
        }
    }
}