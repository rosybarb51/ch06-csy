package ch06;

// 기본 조건은 문제 1과 동일
public class CarInfo2 {
    String company;
    String model;
    String gasType;
    String type;
    String size;
    String color;
    String price;

//    생성자명은 클래스명과 동일
//    생성자는 반환값 없음(void 도 입력하지 않음, 반환값 입력 부분 자체가 없음)
//    생성자도 기본적으로 메서드와 동일한 기능을 가지고 있음
//    생성자 오버로딩은 동일한 이름의 생성자를 생성 시 매개변수의 타입, 개수, 순서를 다르게하여 여러개의 생성자를 만들어 사용하는 방식
    
//    모든 정보를 사용자에게 입력받아 사용하는 형태
    public CarInfo2(String company, String model, String gasType, String type, String size, String color, String price) {
        this.company = company;
        this.model = model;
        this.gasType = gasType;
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
    }

//    중요한 매개변수 몇개만 사용한 생성자
//    중요한 몇가지 정보만 사용자에게 입력받고 나머지 정보는 개발자가 고정하여 입력하는 형태
    public CarInfo2(String model, String gasType, String type, String price) {
        this.company = "쉐보레";
        this.model = model;
        this.gasType = gasType;
        this.type = type;
        this.size = "중형";
        this.color = "회색";
        this.price = price;
    }

//    매개변수가 없는 형태의 생성자
//    모든 정보를 개발자가 고정하여 입력하는 형태
    public CarInfo2() {
        company = "쉐보레";
        model = "말리부";
        gasType = "가솔린";
        type = "세단";
        size = "중형";
        color = "회색";
        price = "2,364";
    }

    public void setCarInfo(String company, String model, String gasType, String type, String size, String color, String price) {
        this.company = company;
        this.model = model;
        this.gasType = gasType;
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void getCarInfo() {
        System.out.println("나의 자동차는 " + company + "의 " + model + "이고, " + gasType + "을 사용하는 " + color + "색상의 " + size + "" + type + "입니다.");
    }
}

    