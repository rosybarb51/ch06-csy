package ch06;

public class Person {
	String name;
	float height;
	float weight;
	
//	�⺻ ������, �ٸ� �����ڸ� ������� ��� �⺻ �����ڰ� �ڵ����� �������� �ʱ� ������ �ʿ��� ��� ���� �����ؾ� ��
	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}
