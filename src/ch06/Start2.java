package ch06;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 studentAhn = new Student2();
		studentAhn.studentName = "�ȿ���";
		
//		Ŭ������ ����� �ش� Ŭ������ ��üȭ ��Ų �� ����� �� ����
//		System.out.println(studentName);
//		System.out.println(Student2.studentName);
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}