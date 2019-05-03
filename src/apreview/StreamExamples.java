package apreview;

import java.util.*;
import java.util.stream.Collectors;

class Student implements Person {
    private String name;
    private double gpa;

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student: " + name + " " + gpa;
    }
}

private static ArrayList<Student> newFilter(ArrayList<Student> col, int minLength) {
    return  col.stream()
            .filter(e -> e.getName().length() >= minLength)
            .collect(Collectors.toCollection(ArrayList<Student>::new));
}

private static ArrayList<Student> filter(ArrayList<Student> col, int minLength) {
    ArrayList<Student> result = new ArrayList<>();
    for (Student temp : col)
        if (temp.getName().length() >= minLength)
            result.add(temp);
    return result;
}

public static void main(String[] args) {
    ArrayList<Student> col = new ArrayList<>();
    // add a bunch of students to the list
    ArrayList<Student> newCol = filter(col, 3);
    ArrayList<Student> newnewCol = newFilter(col, 3);
}