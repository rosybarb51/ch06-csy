package ch06;

public class CalculatorMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator8 cal8 = new Calculator8();
		System.out.println("가로가 10인 정사각형의 넓이는 : " + cal8.areaRectangle(10));
		System.out.println("가로가 10이고, 세로가 5인 직사각형의 넓이는 " + cal8.areaRectangle(10.0, 5.0));
		
		System.out.println("----- 오버로딩 -----");
		
		Calculator9 cal9 = new Calculator9();
		System.out.println("정수 2개를 입력하는 덧셈 : " + cal9.plus(10, 5));
		System.out.println("정수 1개와 실수 1개를 입력하는 덧셈 : " + cal9.plus(10, 5.0));
		System.out.println("실수 1개와 정수 1개를 입력하는 덧셈 : " + cal9.plus(10.0, 5));
		System.out.println("실수 2개를 입력하는 덧셈 : " + cal9.plus(10.0, 5.0));
		
		
		System.out.println("\n----- 문제 1 -----\n");
		// 문제 1) 메서드 오버로딩을 사용하여 계산기 프로그램을 작성하세요
		// 조건1. 메서드는 사칙연산(나머지 연산포함) 모두 구현해야함
		// 조건2. 입력받는 데이터는 2개, 정수 혹은 실수
		Calculator10 cal10 = new Calculator10();
		System.out.println("두 수의 덧셈은 : " + cal10.plus(10, 20));
		System.out.println("두 수의 덧셈은 : " + cal10.plus(10, 20.0));
		System.out.println("두 수의 덧셈은 : " + cal10.plus(10.0, 20));
		System.out.println("두 수의 덧셈은 : " + cal10.plus(10.0, 20.0));
		
		System.out.println("\n----- 문제 2 -----\n");
		// 문제 2) 메서드 오버로딩을 사용하여 계산기 프로그램을 작성하세요
		// 조건1. 메서드는 사칙연산(나머지 연산 포함)을 모두 구현해야함
		// 조건2. 입력받는 데이터는 2개, 정수 혹은 실수
		// 조건3. 멤버 변수 x, y가 존재하며 여기에 데이터를 입력한 후 연산
		// 조건4. 화면에 출력을 하기 위한 전용 메서드를 사용
		// 조건5. 출력 전용 메서드는 현재 연산이 어떤 것이었는지 확인하는 매개변수를 1개 입력받아 해당 매개변수에 따라서 화면에 출력하는 문자열이 달라져야함
		Calculator11 cal11 = new Calculator11(1, 1);
		cal11.plus(10, 10);
		cal11.plus(10, 10.0);
		cal11.plus(10.0, 10);
		cal11.plus(10.0, 10.0);
		
	}

}





















