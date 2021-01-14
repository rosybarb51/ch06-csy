package ch06;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator 클래스를 myCal 이란 이름으로 객체화
		Calculator myCal = new Calculator();
//		Calculator 클래스의 멤버 메소드 powerOn()을 실행
		myCal.powerOn();
		
//		정수형 변수 result를 선언하고, Calculator 클래스의 멤버 메소드 plus()를 실행
//		매개변수를 5, 6을 넘겨줘서 실행
		int result = myCal.plus(5, 6);
		System.out.println("result = " + result);
		
//		멤버 변수가 아닌 그냥 일반 변수
		byte x = 10;
		byte y = 4;
//		myCal의 멤버 메소드 divide()를 실행
//		매개변수를 x, y 2개를 가지고 실행
//		divide() 메소드는 매개변수로 int 타입의 변수를 2개 받으나 실제로 넘겨준 x와 y는 byte 타입이었음
//		int 타입은 byte 타입보다 데이터 타입의 크기가 크기 때문에 byte 타입은 int 타입으로 자동타입변환이 발생함
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

//문제 1) Calculator 클래스를 수정하여 곱하기, 빼기 메소드를 생성하고 사용하는 프로그램으로 작성하세요
// 곱하기 메서드명 : multiple
// 빼기 메서드명 : minus
// 압축 파일명 : Calculator_이름.zip
// 압축할 파일명 : CalculatorMain.java, Calculator.java

// 문제 2) Calculator2 클래스를 생성하고, 사칙연산을 위한 멤버 변수 x, y와 멤버 메서드 plus, minus, multi, div를 선언하고, 데이터를 입력하기 위한 멤버 메서드 setting() 출력 전용 메서드 print() 를 들어서 사칙연산을 진행하는 프로그램을 제작하세요
// 생성할 멤버 변수 : x, y
// 멤버 메소드 : plus, minus, multi, div, setting, print
// setting, print 만 매개변수가 존재, 나머지는 매개변수 없음
// plus, minus, multi, div는 멤버 변수를 이용해서 연산
// 결과는 print 메서드를 이용해서 결과를 출력













