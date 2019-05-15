package apreview;

import java.util.ArrayList;

public class Quadratic implements Polynomial {
    private ArrayList<Monomial> eq;

    public Quadratic(ArrayList<Monomial> terms) {
        eq = terms;
    }

    /**
     * Returns true if the determinant is>= 0 and false if the determinant is
     * negative.
     * 
     * @param a the coefficient of the degree 2 monomial
     * @param b the coefficient of the degree 1 monomial
     * @param c the coefficient of the degree 0 monomial
     * 
     * @return true if the determinant is >= 0 and false otherwise
     */
    private boolean hasRoots(double a, double b, double c) {
        return b * b - 4 * a * c >= 0;
    }

    public int getDegree() {
        return 2;
    }

    public String getName() {
        /*String termC = switch (eq.size()) {
        case 1 -> "Monomial";
        case 2 -> "Binomial";
        case 3 -> "Trinomial";
        default -> "Polynomial";
        };*/
        return "Quadratic "/* + termC*/;
    }

    public int getNumTerms() {
        return eq.size();
    }

    /**
     * Returns the roots of the Quadratic as determined by the quadratic formula. If
     * the quadratic has no real roots, then null is returned.
     *
     * @return the roots of the Quadratic or null
     */
    public double[] getRoots() {
        double[] roots = new double[2];
        double a = eq.get(0).getCoefficient();
        double b = 1 < eq.size() ? eq.get(1).getCoefficient() : 0;
        double c = 2 < eq.size() ? eq.get(2).getCoefficient() : 0;
        if (!hasRoots(a, b, c))
            return null;
        roots[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        roots[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return roots;
    }
}