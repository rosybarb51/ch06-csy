package ch06;

// 기본 조건은 문제1과 동일
public class CarInfo3 {
    String company;
    String model;
    String gasType;
    String type;
    String size;
    String color;
    String price;

//    this() 생성자 : 객체 생성 시 자동으로 실행되는 생성자에서 또 다른 생성자를 실행시키고자 할때 사용하는 명령어
//    this() 생성자는 해당 생성자의 코드블럭에서 첫번째 줄에 입력해야함
    public CarInfo3(String company, String model, String gasType, String type, String size, String color, String price) {
        this.company = company;
        this.model = model;
        this.gasType = gasType;
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public CarInfo3(String model, String gasType, String type, String price) {
        this("쉐보레", model, gasType, type, "중형", "회색", price);
    }

    public CarInfo3() {
        this("쉐보레", "말리부", "가솔린", "세단", "중형", "회색", "2,364");
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

