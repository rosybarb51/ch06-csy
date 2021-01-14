package ch06;

public class CalculatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� ����� ����� ����
//		��üȭ �۾����� �ٷ� ���� ����� ����� �� ����
		Calculator3.x = 10;
		Calculator3.y = 5;
		Calculator3.plus();
		Calculator3.minus();
		
//		�ν��Ͻ� ����� ����� ����
//		��üȭ �۾����̴� �ν��Ͻ� ����� ����� �Ұ�����
		Calculator4 cal4 = new Calculator4();
		cal4.x = 10;
		cal4.y = 5;
		cal4.plus();
		cal4.minus();
		cal4.divide();
		// ���� ��� �޼���� ��üȭ�ؼ� ����ϸ� �ȵ�
		cal4.multi();
//		���� ��� �޼���� Ŭ������.��������޼���� ���� ���
		Calculator4.multi();
		
		System.out.println("\n----------\n");
		
		Calculator5 cal1 = new Calculator5();
		Calculator5 cal2 = new Calculator5();
		
		cal1.x = 10;
		cal1.y = 5;
		cal1.plus();
		
		cal2.x = 100;
		cal2.y = 50;
		cal2.plus();
		
		System.out.println(cal1.x);
		System.out.println(cal2.x);
		
		System.out.println(cal1.staticX);
		System.out.println(cal2.staticX);
		System.out.println(cal1.staticY);
		System.out.println(cal2.staticY);
		
		cal1.staticX = 1000;
		cal2.staticY = 500;
//		�Ʒ��� ���´� ����� �� ������ ����ϸ� �ȵ�
		System.out.println(cal1.staticX);
		System.out.println(cal2.staticX);
		System.out.println(cal1.staticY);
		System.out.println(cal2.staticY);
		
//		���� ����� ����ε� ��� ���
		System.out.println(Calculator5.staticX);
		
		
		System.out.println("\n----- ������ -----\n");
		
//		�����ڴ� ��ü ���� �� �ڵ� ����
		Calculator6 cal61 = new Calculator6();
		Calculator6 cal62 = new Calculator6(10, 5);
		Calculator6 cla63 = new Calculator6(100);
		
//		cal61.x = 10;
//		cal61.y = 5;
		
//		���α׷� ���� �� �Ź� �ʿ��� ���� �Է��ؾ���
//		�Ǽ��� setValue()�� ���������ʰ� plus()�� ���� �� ������ �߻�
//		setValue() �������� �ʾ��� ��쿡�� �⺻���� �ԷµǾ� ����Ǳ⸦ ���� ��� ����ϴ� ���� ������
//		cal61.setValue(1000, 500);
		
		cal61.setValue(100, 50);
		cal61.currentValue();
		
		cal61.plus();
		
		
		System.out.println("\n----- ������ �����ε� -----\n");
		
		Calculator7 cal71 = new Calculator7(1000, 500);
		
		Calculator7 cal72 = new Calculator7(100);
		
		Calculator7 cal73 = new Calculator7();
	}
}


// �ҽ��� �����Ͽ� ī������ ����, ��¥_������ȣ_�̸�.zip

//문제 1) 자동차에 대한 정보를 저장할 수 있는 클래스를 생성하여 자동차에 대한 정보를 출력하는 프로그램을 작성하세요
//조건1. 기본 생성자를 1개 가지고 있어야함
//조건2. 자동차 정보 입력 메서드, 자동차 정보 출력 메서드
//조건3. 클래스명 : CarInfo, 실행 클래스는 CarInfoMain
//조건4. 필요한 자동차 정보 : 회사명, 모델명, 연료종류, 차종류, 크기, 색상, 가격 (네이버 자동차, 다음 자동차에서 확인)
//조건5. 클래스를 이용하여 생성하는 객체는 2개 이상

//문제 2) 1번 문제의 CarInfo클래스를 수정하여 CarInfo2로 새로 생성하고 생성자를 3개 이상 사용하는 방식의 클래스를 생성하여 자동차의 정보를 출력하는 프로그램을 작성하세요
//조건1. 생성자를 기본생성자를 포함하여 총 3개 이상 생성
//조건2. 클래스를 이용하여 생성하는 객체는 2개 이상
//조건3. this() 생성자는 사용하지 않음

//문제 3) 1번 문제의 CarInfo클래스를 수정하여 생성자를 3개 이상 사용하는 형태로 수정하고, this() 생성자를 사용하여 최종 생성자를 실행하는 방식의 클래스로 생성하여 자동차의 정보를 출력하는 프로그램을 작성하세요
//조건1. 클래스의 이름은 CarInfo3
//조건2. this() 생성자는 어떠한 형태든지 1번 이상 사용
//조건3. 클래스를 이용하여 생성하는 객체는 2개 이상













