package kh.lclass.collection;

public class Main {

	public static void main(String[] args) {
		TestCollection tc = new TestCollection();
		
		String str = tc.testGeneric(35.5);
		System.out.println(str);
		str = tc.testGeneric("안녕");
		System.out.println(str);
		str = tc.testGeneric(new Car(330));
		System.out.println(str);
	}

}

