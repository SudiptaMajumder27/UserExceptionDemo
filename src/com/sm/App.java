package com.sm;
import java.util.Scanner;
import com.sm.model.Student;
import com.sm.except.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter roll of the student: ");
		long roll = sc.nextLong();
		sc.nextLine();
		System.out.print("Ente name of the student: ");
		String sname = sc.nextLine();
		System.out.print("Ente marks prcentage of the student: ");
		double mp = sc.nextDouble();
		Student st = null;
		
		try {
			if(roll<=0) {
				throw  new StudentRollException(roll);
			}
			 st = new Student(roll ,sname, mp );
		}catch(StudentRollException ex) {
			System.out.println(ex);
			roll = 1;
			 st = new Student(roll ,sname, mp );
		}finally {
			System.out.println(st);
		}

	}

}
