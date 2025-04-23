package lab.student.control;

import lab.student.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student("0001", "김민수", "컴퓨터공학", 3);
		
		System.out.println(
				stu1.getName() + " / "
						+ stu1.getMajor() + " / "
							+ stu1.getGrade() + "학년");
		stu1.setGrade(5);
		
		// 확인
		System.out.println(stu1.getGrade());
		
	}
}
