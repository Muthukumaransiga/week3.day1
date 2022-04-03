package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		
		System.out.println("Muthukumaran");

	}
	public void studentDept() {
		
		System.out.println("computer science");

	}
	public void studentId() {
	
		System.out.println("201122");

	}
	public static void main(String[] args) {
		Student stu=new Student();
			stu.collegeCode();
			stu.collegeName();
			stu.collegeRank();
			stu.deptName();
			stu.studentDept();
			stu.studentId();
			stu.studentName();
			
			
			
		}

}
