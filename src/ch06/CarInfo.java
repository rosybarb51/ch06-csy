package ch06;

public class CarInfo {
//	멤버 변수
	String company; // 회사명
	String model; // 차이름
	String gasType; // 연료 종류
	String type; // 차량 타입
	String size; // 차량 크기
	String color; // 차량 색상
	String price; // 차량 가격

//    생성자는 클래스명과 동일한 이름 사용
//    기본 생성자는 매개 변수가 없음
//    개발자가 생성자를 1개도 입력하지 않았을 경우 컴파일러는 자동으로 기본 생성자를 생성함
	public CarInfo() {
	    company = "쉐보레";
	    model = "말리부";
	    gasType = "가솔린";
	    type = "세단";
	    size = "중형";
	    color = "회색";
	    price = "2,364";
	}

//    차량 정보 입력 메서드
    public void setCarInfo(String company, String model, String gasType, String type, String size, String color, String price) {
        this.company = company;
        this.model = model;
        this.gasType = gasType;
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
    }

//    차량 정보 출력 메서드
    public void getCarInfo() {
    	System.out.println("나의 자동차는 " + company + "의 " + model + "이고, " + gasType + "을 사용하는 " + color + "색상의 " + size + "" + type + "입니다.");
    }
}
