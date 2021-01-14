package ch06;

public class Calculator11 {
	double x;
	double y;
	
	public Calculator11(int x, int y) {
		this((double)x, (double)y);
	}
	
	public Calculator11(int x, double y) {
		this((double)x, y);
	}
	
	public Calculator11(double x, int y) {
		this(x, (double)y);
	}
	
	public Calculator11(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void plus(int x, int y) {
        int result = x + y;
        printer(result, "+");
    }

    public void plus(int x, double y) {
        double result = x + y;
        printer(result, "+");
    }

    public void plus(double x, int y) {
        double result = x + y;
        printer(result, "+");
    }

    public void plus(double x, double y) {
        double result = x + y;
        printer(result, "+");
    }

    public void minus(int x, int y) {
        int result = x - y;
        printer(result, "-");
    }

    public void minus(int x, double y) {
        double result = x - y;
        printer(result, "-");
    }

    public void minus(double x, int y) {
        double result = x - y;
        printer(result, "-");
    }

    public void minus(double x, double y) {
        double result = x - y;
        printer(result, "-");
    }

    public void multi(int x, int y) {
        int result = x * y;
        printer(result, "*");
    }

    public void multi(int x, double y) {
        double result = x * y;
        printer(result, "*");
    }

    public void multi(double x, int y) {
        double result = x * y;
        printer(result, "*");
    }

    public void multi(double x, double y) {
        double result = x * y;
        printer(result, "*");
    }

    public void divide(int x, int y) {
        double result = x / y;
        printer(result, "/");
    }

    public void divide(int x, double y) {
        double result = x / y;
        printer(result, "/");
    }

    public void divide(double x, int y) {
        double result = x / y;
        printer(result, "/");
    }

    public void divide(double x, double y) {
        double result = x / y;
        printer(result, "/");
    }

    public void mod(int x, int y) {
        double result = x % y;
        printer(result, "%");
    }

    public void mod(int x, double y) {
        double result = x % y;
        printer(result, "%");
    }

    public void mod(double x, int y) {
        double result = x % y;
        printer(result, "%");
    }

    public void mod(double x, double y) {
        double result = x % y;
        printer(result, "%");
    }
    
    public void printer(int result, String op) {
        if (op.equals("+")) {
            System.out.println("두 수의 덧셈은 " + result);
        }
        else if (op.equals("-")) {
            System.out.println("두 수의 뺄셈은 " + result);
        }
        else if (op.equals("*")) {
            System.out.println("두 수의 곱셈은 " + result);
        }
        else if (op.equals("/")) {
            System.out.println("두 수를 나눈 몫은 " + result);
        }
        else {
            System.out.println("두 수를 나눈 나머지는 " + result);
        }
    }

    public void printer(double result, String op) {
        switch (op) {
            case "+":
            System.out.println("두 수의 덧셈은 " + result);
            break;

            case "-":
            System.out.println("두 수의 뺄셈은 " + result);
            break;

            case "*":
            System.out.println("두 수의 곱셈은 " + result);
            break;

            case "/":
            System.out.println("두 수를 나눈 몫은 " + result);
            break;

            default:
            System.out.println("두 수를 나눈 나머지는 " + result); 
            break;
        }
    }

}
