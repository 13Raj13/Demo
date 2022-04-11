package com.raj.connection;

import java.util.*;

import com.raj.DAO.StudentDaoImplementation;
import com.raj.model.Student;

public class ConnectionTest_MainClass {

	public static void main(String[] args) {

		List<Student> ls = new ArrayList<Student>();
		StudentDaoImplementation sdi = new StudentDaoImplementation();
		Scanner sc = new Scanner(System.in);

		// int id=sc.nextInt();

		System.out.println();
		System.out.println("                    Select the option                    ");
		System.out.println("_________________________________________________________");
		System.out.println("\t 1->To get the list of the Students");
		System.out.println("\t 2->To Insert Student");
		System.out.println("\t 3->To Remove Student");
		System.out.println("\t 4->To Update the address of Student");
		System.out.println("_________________________________________________________");

		int num = sc.nextInt();

		switch (num) {
		case 1:
			Student s = new Student();
			for (Student s1 : sdi.getList()) {
				System.out.println("students id: " + s1.getSid());
				System.out.println("students first name: " + s1.getFname());
				System.out.println("students last name: " + s1.getLname());
				System.out.println("students age: " + s1.getAge());
				System.out.println("students address: " + s1.getAddress());
				System.out.println("===============================");
			}
			break;

		case 2:
			System.out.println("Enter first name: ");
			String fname = sc.next();
			System.out.println("Enter last name: ");
			String lname = sc.next();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Enter address: ");
			String address = sc.next();

			sdi.insertStudent(fname, lname, age, address);
			break;

		case 3:
			System.out.println("Enter the id: ");
			int id = sc.nextInt();
			sdi.removeStudent(id);
			break;

		case 4:
			System.out.println("Enter your id: ");
			int id1 = sc.nextInt();
			System.out.println("Enter the new address: ");
			String newAddress = sc.next();
			sdi.changeAddress(id1, newAddress);
			break;

		default:
			System.out.println("The number which you have entered is not valid");
			break;
		}

	}

}
