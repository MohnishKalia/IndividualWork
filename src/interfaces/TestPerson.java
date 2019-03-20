package interfaces;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Teacher bob = new Teacher();
//		Person rob = bob;
//		System.out.println("Name: " + rob.getName());
//		System.out.println("Age: " + rob.getAge());
//		Student call = new Student();
//		rob = call;
//		System.out.println("Name: " + rob.getName());
//		System.out.println("Age: " + rob.getAge());
//		Scanner input = new Scanner(System.in);
//		Teacher t = new Teacher();
//		Student s = new Student();
//		System.out.println("What is the teacher's name?");
//		t.setName(input.nextLine());
//		t.payMe();
//		System.out.println("What is the student's name?");
//		s.setName(input.nextLine());
//		for (int i = 0; i < 3; i++)
//			s.outSick();
//		Person p = t;
//		System.out.println("Name: " + p.getName() + " Age: " + p.getAge());
//		p = s;
//		System.out.println("Name: " + p.getName() + " Age: " + p.getAge());
//		input.close();
		ArrayList<Person> people = new ArrayList<Person>();
		for (int i = 0; i < 7; i++) {
			people.add(new Student());
			people.add(new Teacher());
		}
		for (Person temp : people) {
			System.out.println(temp.getName());
		}
	}

}
