package wrappers;

import java.util.*;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            System.out.println("What is the person's name?");
            names.add(input.nextLine());
        }
        int coolength = 150;
        for (String temp : names)
            if (temp.length() < coolength)
                coolength = temp.length();
        System.out.println(coolength);
        input.close();
    }
}