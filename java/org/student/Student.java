package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName() {
		System.out.println("Lavanya");
	}
	public void studentDept() {
		System.out.println("Communication");
	}
	public void studentId() {
		System.out.println("25");
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		student.studentName();
		student.studentDept();
		student.studentId();
		student.deptName();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
	}
}
