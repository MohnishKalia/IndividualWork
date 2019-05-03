package apreview;

public class Monomial {
    private double coefficient;
    private int degree;

    public Monomial(double coeff, int deg) {
        coefficient = coeff;
        degree = deg;
    }

    public int getDegree() {
        return degree;
    }

    public double getCoefficient() {
        return coefficient;
    }
}