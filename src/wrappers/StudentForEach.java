package wrappers;

import java.util.*;
import objectProgramming.*;

public class StudentForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> classroom = new ArrayList<Student>();
        System.out.println("How many students are in the class?");
        for (int i = 0; i < input.nextInt(); i++) {
            input.nextLine();
            System.out.println("Name?");
            String name = input.nextLine();
            System.out.println("Test Score?");
            int score = input.nextInt();
            classroom.add(new Student(name, score));
        }
        System.out.println("What letter would you like to search for?");
        String search = input.next();
        for (Student temp : classroom) {
            if (temp.returnName().charAt(0) == search.charAt(0))
                System.out.println(temp.returnName() + " " + temp.returnScore());
        }
        System.out.println("What score would you like to search for?");
        int bias = input.nextInt();
        for (Student temp : classroom) {
            if (temp.returnScore() > bias)
                System.out.println(temp.returnName() + " " + temp.returnScore());
        }
        input.close();
    }
}