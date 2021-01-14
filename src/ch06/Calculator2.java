package ch06;

public class Calculator2 {
//	¸â¹ö º¯¼ö
	int x;
	int y;
	
//	¸â¹ö ¸Ş¼Òµå
	public void setting(int inputX, int inputY) {
		x = inputX;
		y = inputY;
	}
	
	public void printer(int result, char oper) {
		switch (oper) {
		case '+':
			System.out.println("µÎ ¼öÀÇ µ¡¼ÀÀº " + result);
			break;
			
		case '-':
			System.out.println("µÎ ¼öÀÇ »¬¼ÀÀº " + result);
			break;
			
		case '*':
			System.out.println("µÎ ¼öÀÇ °ö¼ÀÀº " + result);
			break;
			
		case '/':
			System.out.println("µÎ ¼öÀÇ ³ª´°¼ÀÀº " + result);
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
