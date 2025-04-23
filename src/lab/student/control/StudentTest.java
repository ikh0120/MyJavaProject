package lab.student.control;

import lab.student.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student("0001", "±è¹Î¼ö", "ÄÄÇ»ÅÍ°øÇĞ", 3);
		
		System.out.println(
				stu1.getName() + " / "
						+ stu1.getMajor() + " / "
							+ stu1.getGrade());
		stu1.setGrade(5);
		
	}
}
