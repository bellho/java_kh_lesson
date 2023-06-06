package kh.lclass;

public class TestOperator {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		double num3 = 3.0;
		System.out.println(num1 % num2);
		System.out.println(num1 % num3);
		System.out.println(-num1);
		System.out.println(-(-num1 - 10));
		System.out.println("==================================");
		//
		int a = 10;
		System.out.println(++a);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println("==================================");
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);

		System.out.println("비교연산자 결과는 ture/false");
		System.out.println(3 < 7);

		boolean b = 3 < 7;
		// boolean d = !3; 정수값, 실수값, 문자값,

		int num5 = 10;
		int i = 2;
		System.out.println("==================================");

		boolean value = ((num5 = num5 + 10) > 10) & ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num5);
		System.out.println(i);

		int age = 19;
		
		if (age == 8) {
			System.out.println("학교에 입학하였습니다.");
		} else if (age > 8 && age < 19) {
			System.out.println("학교에 다닙니다.");
		} else if (19 == age) {
			System.out.println("곧 졸업합니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
			
		}
		
	}
}
