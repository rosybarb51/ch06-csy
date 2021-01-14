package ch06;

public class Calculator10 {
	public int plus(int x, int y) {
//        int result = x + y;
//        return result;
		return (int)plus((double)x, (double)y);
    }

//	오버로딩됨, 데이터 타입이 다르기 때문에 가능
    public double plus(int x, double y) {
//    	double 타입과 int 타입을 연산하면 int 타입이 double 타입으로 자동 타입 변환이 발생함
//        double result = x + y;
//        return result;
    	return plus((double)x, y);
    }

//    오버로딩됨, 데이터 타입의 순서가 다르기 때문에 가능
    public double plus(double x, int y) {
//        double result = x + y;
//        return result;
    	return plus(x, (double)y);
    }

//    오버로딩됨, 데이터 타입이 다르기 때문에 가능
    public double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    public int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    public double minus(int x, double y) {
        double result = x - y;
        return result;
    }

    public double minus(double x, int y) {
        double result = x - y;
        return result;
    }

    public double minus(double x, double y) {
        double result = x - y;
        return result;
    }

    public int multi(int x, int y) {
        int result = x * y;
        return result;
    }

    public double multi(int x, double y) {
        double result = x * y;
        return result;
    }

    public double multi(double x, int y) {
        double result = x * y;
        return result;
    }

    public double multi(double x, double y) {
        double result = x * y;
        return result;
    }

    public double divide(int x, int y) {
        double result = x / y;
        return result;
    }

    public double divide(int x, double y) {
        double result = x / y;
        return result;
    }

    public double divide(double x, int y) {
        double result = x / y;
        return result;
    }

    public double divide(double x, double y) {
        double result = x / y;
        return result;
    }

    public double mod(int x, int y) {
        double result = x % y;
        return result;
    }

    public double mod(int x, double y) {
        double result = x % y;
        return result;
    }

    public double mod(double x, int y) {
        double result = x % y;
        return result;
    }

    public double mod(double x, double y) {
        double result = x % y;
        return result;
    }
}
