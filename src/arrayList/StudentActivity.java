package arrayList;

import java.util.ArrayList;

import objectProgramming.Student;
public class StudentActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> classroom = new ArrayList<Student>();
		for (int i = 0; i < 12; i++) {
			classroom.add(new Student("Student" + i, i));
		}
		Student first = classroom.remove(0);
		classroom.add(2, first);
		Student last = classroom.remove(classroom.size() - 1);
		classroom.set(0, last);
		for (int j = 0; j < classroom.size(); j++)
			System.out.println(classroom.get(j).returnName());
	}
}
