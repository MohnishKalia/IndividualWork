package apreview;
public class BinaryInt {
    private int bin;

    public BinaryInt() {
        bin = 0;
    }

    public int setBin(int dec) {
        // return Integer.parseInt(dec+"", 2);
        bin = convert(dec);
        return bin;
    }
    private int convert(int dec){
        return dec == 0 ? 0 : dec % 2 + 10 * convert(dec / 2);
    }

    public String getString() {
        return "" + bin;
    }

    public int addBin(int dec) {
        int sum = dec + convert(bin);
        return Integer.valueOf(Integer.toBinaryString(sum));
    }

    public int compareBin(int dec) {
        if (bin > dec)
            return -1;
        if (dec > bin)
            return 1;
        return 0;
    }

}