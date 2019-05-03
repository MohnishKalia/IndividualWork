package apreview;
public class LocationNumeral {
    /**
     * Returns the decimal value of a single LN 'letter
     *
     * @param letter String containing a single LN letter
     * @return the decimal value of that letter Precondition: the parameter contains
     *         a single uppercase letter
     */
    public int getLetterValue(String letter) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num = letters.indexOf(letter);
        int result = 1;
        for (int i = 0; i < num; i++)
            result *= 2;
        return result;
        /* to be implemented in part (a) */
    }

    /**
     * Return the Location Numeral letter representation for a decimal value that is
     * a power of two.
     *
     * @param value the decimal value to be converted to a Location Numeral letter
     * @return the corresponding Location Numeral letter Precondition: The parameter
     *         must be an integer power of two between 2 raised to the power O and 2
     *         raised to the power 25.
     */
    public String getLetter(int value) {return "";/* implementation not shown */ }

    /**
     * Returns the decimal value of a simplified Location Numeral
     *
     * @param numeral String representing a Location Numeral
     * @return the decimal value of the Location Numeral. Precondition: The
     *         characters in the parameter are uppercase letters A-Z only.
     */
    public int getDecimalValue(String numeral) {
        int total = 0;
        for (char temp : numeral.toCharArray()) {
            total += getLetterValue("" + temp);
        }
        return total;

        /* to be implemented in part (b) */ }

    /**
     * Sorts the letters of a Location Numeral into alphabetical order
     *
     * @param numeral String representing a Location Numeral
     * @return the String in alphabetical order
     */
    public String sortLocationNumeral(String numeral) {return "";/* implementation not shown */ }

    /**
     * Adds two Location Numerals and returns a simplified result
     *
     * @param num1 String representing the first addend as a LN
     * @param num2 String representing the second addend as a LN
     * @return String which represents the sum as a simplified LN
     *
     *         Precondition: The characters in the parameters are uppercase letters
     *         A-Z only. Postcondition: The letters in the returned String are in
     *         alphabetical order and no letter occurs more than once.
     */
    public String add(String num1, String num2) {
        String comb = num1 + num2;
        comb = sortLocationNumeral(comb);
        String result = "";
        int value = getDecimalValue(comb);
        // creating binary representation without while loop
        String bin = Integer.toString(value, 2);
        // from the lowest place value to the largest
        for (int i = bin.length() - 1; i >= 0; i--) {
            // 2 ^ index of occurance
            result += bin.charAt(i) == '1' ? getLetter((int) Math.pow(2, bin.length() - 1 - i)) : "";
        }
        return result;
        /* to be implemented in part (c) */ }
    /* Additional implementation not shown */
}