package ch06;

public class Calculator5 {
	int x;
	int y;
	static int staticX;
	static int staticY;

	public void plus() {
		int result = x + y;
		System.out.println("�� ���� ������ : " + result);
	}
	
	public static void staticPlus() {
		int result = staticX + staticY;
		System.out.println("�� ���� ������ : " + result);
	}
}
