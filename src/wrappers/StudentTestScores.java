package wrappers;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentTestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("How many students are in the class?");
        for (int i = 0; i < input.nextInt(); i++) {
            System.out.println("What is the student's score?");
            scores.add(input.nextInt());
        }
        int max = 0;
        int min = 999;
        for (int temp : scores) {
            if (temp > max)
                max = temp;
            if (temp < min)
                min = temp;
        }
        Integer tempM = scores.remove(scores.indexOf(max));
        Integer tempL = scores.remove(scores.indexOf(min));
        scores.add(tempM);
        scores.add(0, tempL);
        System.out.println();
        for (int temp : scores) {
            System.out.println(temp);
        }
        input.close();
    }
}