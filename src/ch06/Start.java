package ch06;

public class Start {

//	Ŭ������ 2���� ����, ���� Ŭ����, ���̺귯�� Ŭ����
//	���� Ŭ������ main() �޼��带 ������ ����
//	�ϳ��� ���α׷��� �ϳ��� main() �޼���� �������� ���̺귯�� Ŭ������ ������ ����
//	main() �޼���� ���α׷��� ���� ����
//	main() �޼��忡�� �������� ���̺귯�� Ŭ������ ��üȭ�Ͽ� ���̺귯���� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�ڹٿ��� ���� ��� �� �����ϰ� �ʱ�ȭ���� �ʰ� ��� �� ������ �߻���
//		int studentID;
//		String studentName;
//		int grade;
//		String address;
//		
//		System.out.println(studentID);
//		System.out.println(studentName);
//		System.out.println(grade);
//		System.out.println(address);
		
//		��üȭ�� Ŭ������ ������� �� ��� �޼��带 �����ٰ� ����Ϸ��� ��ü��.���������, ��ü��.����޼���� ���� ���
//		Student Ŭ������ Ŭ���� ���� std�� ��üȭ ��
//		Student std = new Student();
		
//		��üȭ�� std�� ������� studentID�� ȣ��
//		std�� ������� studentID�� 0���� �ڵ� �ʱ�ȭ ��
//		System.out.println(std.studentID);
//		System.out.println(std.studentName);
//		System.out.println(std.grade);
//		System.out.println(std.address);
		
		
//		Ŭ������ ����ϴ� ����
//		1. �������� ���õ� �����͸� �ѹ��� ��Ƽ� ����ϱ� ����
//		�迭�� ����ؼ� �����͸� �����ص� ����� ������ �ڹ��� �迭�� �ڹٽ�ũ��Ʈó�� �������� ������ Ÿ���� �ѹ��� ������ �� ����
//		�ڹ��� �迭�� ���� ������ �����͸� ������ �� ����
//		2. Ư�� ����� ����� ��� ������ �� ����� ����ϱ� ����
//		3. �ҽ��� ��Ȱ���� ����, ������ �ҽ��� ª����
		int studentID1 = 1;
		String studentName1 = "������";
		int grade1 = 102;
		String address1 = "����";
		
		System.out.println(studentID1);
		System.out.println(studentName1);
		System.out.println(grade1);
		System.out.println(address1);
		
		int studentID2 = 2;
		String studentName2 = "���γ�";
		int grade2 = 102;
		String address2 = "����";
		
		System.out.println(studentID2);
		System.out.println(studentName2);
		System.out.println(grade2);
		System.out.println(address2);
		
		int studentID3 = 3;
		String studentName3 = "���缮";
		int grade3 = 102;
		String address3 = "����";
		
		System.out.println(studentID3);
		System.out.println(studentName3);
		System.out.println(grade3);
		System.out.println(address3);
		
		int studentID4 = 4;
		String studentName4 = "���꽽";
		int grade4 = 102;
		String address4 = "����";
		
		System.out.println(studentID4);
		System.out.println(studentName4);
		System.out.println(grade4);
		System.out.println(address4);
		
		int studentID5 = 5;
		String studentName5 = "���η���";
		int grade5 = 102;
		String address5 = "����";
		
		System.out.println(studentID5);
		System.out.println(studentName5);
		System.out.println(grade5);
		System.out.println(address5);
		
//		��ü �����͸� �����ϱ� ���ؼ� �迭�� 4�� ������
//		������ : ������ ���� �� ������ �ٲ� ��� �������� ���Ἲ�� �Ѽյ�
		int[] studentIds = new int[] {1, 2, 3, 4, 5};
		String[] studentNames = new String[] {"������", "���γ�", "���缮", "���꽽", "���η���"};
		int[] grades = new int[] {102, 102, 102, 102, 102};
		String[] addrs = new String[] {"����", "����", "����", "����", "����"};
		
		for (int i = 0; i < studentIds.length; i++) {
			System.out.println(studentIds[i]);
			System.out.println(studentNames[i]);
			System.out.println(grades[i]);
			System.out.println(addrs[i]);
		}
		
		System.out.println(studentIds[0]);
		System.out.println(studentNames[0]);
		System.out.println(grades[0]);
		System.out.println(addrs[0]);
		
		
		Student std = new Student();
		std.inputInfo(1000, "������", 102, "����");
		std.printInfo();
		
		Student std2 = new Student();
		std2.studentID = 2000;
		std2.studentName = "���缮";
		std2.grade = 102;
		std2.address = "����";
		std2.printInfo();
	}
}














