package ch06;

public class Calculator6 {
	private int x;
	private int y = 10;
	
//	������
//	�����ڴ� ��ü ���� �� ���� ���� �����
//	��� ������ �ʱ�ȭ �� ��� �޼��带 ����
//	�����ڴ� Ŭ������� ������ �̸��� �����
//	�����ڴ� �޼���� ���� ������ ����� ������ ����
//	�����ڴ� ��ȯ���� ���� (return Ű���带 ������� ����)
	public Calculator6() {
		this.x = 10;
		this.y = 5;
		
//		return; �޸𸮿� ��ϰ� ���ÿ� �޸𸮿��� ����
	}
	
	public Calculator6(int x) {
		this.x = x;
	}
	
	public Calculator6(int x, int y) {
		this.x = x;
		this.y = y;
		
		currentValue();
	}
	
	public void setValue(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void currentValue() {
		System.out.println("���� x : " + x);
		System.out.println("���� y : " + y);
	}
	
	public void plus() {
		System.out.println("�� ���� ������ : " + (x + y));
	}
}












