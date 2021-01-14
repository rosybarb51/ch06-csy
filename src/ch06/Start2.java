package ch06;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 studentAhn = new Student2();
		studentAhn.studentName = "안연수";
		
//		클래스의 멤버는 해당 클래스를 객체화 시킨 후 사용할 수 있음
//		System.out.println(studentName);
//		System.out.println(Student2.studentName);
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}