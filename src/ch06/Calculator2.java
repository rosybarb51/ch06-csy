package ch06;

public class Calculator2 {
//	��� ����
	int x;
	int y;
	
//	��� �޼ҵ�
	public void setting(int inputX, int inputY) {
		x = inputX;
		y = inputY;
	}
	
	public void printer(int result, char oper) {
		switch (oper) {
		case '+':
			System.out.println("�� ���� ������ " + result);
			break;
			
		case '-':
			System.out.println("�� ���� ������ " + result);
			break;
			
		case '*':
			System.out.println("�� ���� ������ " + result);
			break;
			
		case '/':
			System.out.println("�� ���� �������� " + result);
			break;
		}
	}
	
	public void plus() {
		int result = x + y;
		printer(result, '+');
	}
	
	public void minus() {
		int result = x - y;
		printer(result, '-');
	}
	
	public void multi() {
		int result = x * y;
		printer(result, '*');
	}
	
	public void div() {
		int result = x / y;
		printer(result, '/');
	}
}
