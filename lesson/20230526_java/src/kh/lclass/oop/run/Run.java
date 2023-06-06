package kh.lclass.oop.run;
import kh.lclass.oop.sample.Person;

public class Run {
	
	public static void main(String[] args) {
		
		Person[] personsArray2 = new Person[] {new Person(), new Person(), new Person()};
		
		Person[] personArray = new Person [22];
		for(int i = 0; i < personArray.length; i++) {
			personArray[i] = new Person();
		}
		personArray[0].setAge(25); 
		//java.lang.NullPointerException
		//원인: . 점 앞에 있는 변수(객체 = 인스턴스)가 null 상태
		//해결방법: 변수(객체 = 인스턴스)에 new 생성자(); 를 해줌
		Person[] personArray3 = new Person[22];
		personArray3[0] = new Person();
		personArray3[0].setAge(25);
		personArray3[0].setName("김소똥");
		personArray3[0].setGender('여');
		
		personArray3[1] = new Person("김개똥" , 19, '남');
		personArray3[2] = new Person("맑은눈" , 25, '남');
	}
}
