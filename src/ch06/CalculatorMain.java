package ch06;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator Ŭ������ myCal �̶� �̸����� ��üȭ
		Calculator myCal = new Calculator();
//		Calculator Ŭ������ ��� �޼ҵ� powerOn()�� ����
		myCal.powerOn();
		
//		������ ���� result�� �����ϰ�, Calculator Ŭ������ ��� �޼ҵ� plus()�� ����
//		�Ű������� 5, 6�� �Ѱ��༭ ����
		int result = myCal.plus(5, 6);
		System.out.println("result = " + result);
		
//		��� ������ �ƴ� �׳� �Ϲ� ����
		byte x = 10;
		byte y = 4;
//		myCal�� ��� �޼ҵ� divide()�� ����
//		�Ű������� x, y 2���� ������ ����
//		divide() �޼ҵ�� �Ű������� int Ÿ���� ������ 2�� ������ ������ �Ѱ��� x�� y�� byte Ÿ���̾���
//		int Ÿ���� byte Ÿ�Ժ��� ������ Ÿ���� ũ�Ⱑ ũ�� ������ byte Ÿ���� int Ÿ������ �ڵ�Ÿ�Ժ�ȯ�� �߻���
		double dResult = myCal.divide(x, y);
		System.out.println("dResult = " + dResult);
		
		int minusResult = myCal.minus(x, y);
		System.out.println("minusResult = " + minusResult);
		
		int multiResult = myCal.multiple(x, y);
		System.out.println("multiResult = " + multiResult);
		
		myCal.powerOff();
		
		
		
		Calculator2 cal = new Calculator2();
		cal.setting(10, 5);
		cal.x = 10;
		cal.y = 5;
		cal.plus();
		cal.minus();
		cal.multi();
		cal.div();
	}
}

//���� 1) Calculator Ŭ������ �����Ͽ� ���ϱ�, ���� �޼ҵ带 �����ϰ� ����ϴ� ���α׷����� �ۼ��ϼ���
// ���ϱ� �޼���� : multiple
// ���� �޼���� : minus
// ���� ���ϸ� : Calculator_�̸�.zip
// ������ ���ϸ� : CalculatorMain.java, Calculator.java

// ���� 2) Calculator2 Ŭ������ �����ϰ�, ��Ģ������ ���� ��� ���� x, y�� ��� �޼��� plus, minus, multi, div�� �����ϰ�, �����͸� �Է��ϱ� ���� ��� �޼��� setting() ��� ���� �޼��� print() �� �� ��Ģ������ �����ϴ� ���α׷��� �����ϼ���
// ������ ��� ���� : x, y
// ��� �޼ҵ� : plus, minus, multi, div, setting, print
// setting, print �� �Ű������� ����, �������� �Ű����� ����
// plus, minus, multi, div�� ��� ������ �̿��ؼ� ����
// ����� print �޼��带 �̿��ؼ� ����� ���













