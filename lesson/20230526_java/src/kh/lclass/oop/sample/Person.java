package kh.lclass.oop.sample;

import java.io.Serializable;

public class Person implements Serializable {

	//Field
	/**
	 * 주석은 일반적으로 녹색
	 * 이것은 파란색
	 * java docs에 표시됨
	 * 여기에 UID 생성날짜, 누가, 무엇때문에 작성하였는지 게시 
	 */
	private static final long serialVersionUID = 2324920168885089595L;
	protected String name;
	private int age;
	private char gender;
	
	//Constructor
	public  Person() {}
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//Method
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	//getter, setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return this.gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
