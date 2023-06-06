package kh.lclass;

import java.util.Arrays;

import kh.lclass.oop.sample.Student;

public class TestArray {
	public static void main(String[] args) {
		String strArr[] = new String [3];
		strArr[0] = "apple";
		strArr[1] = "banana";
		strArr[2] = new String("mango");
		// strArr을 복사함 strCopy 생성
		String[] strCopyArr = new String[strArr.length];
		for(int i = 0; i < strArr.length; i++) {
			strCopyArr[i] = strArr[i];
			System.out.println(strCopyArr[i] + " : " + strArr[i]);
		}
		
		System.out.println("=== Array.copyOf ===");
		String[] strCopyArr2 = Arrays.copyOf(strArr, 3);
		for(int i = 0; i < strCopyArr2.length; i++) {
			System.out.println(strCopyArr[i]);
		}
		
		System.out.println("=== System. ===");
		String[] strCopyArr3 = new String[5];
		System.arraycopy(strArr, 1, strCopyArr3, 0, 2);
		
		
		String [] strArr2 = {"apple", "banana", new String("mango")};
		String [] strArr3 = {new String("apple"), new String("banana"), new String("mango")};
		String[] strArr4 = new String[] {new String("apple"), new String("banana"), new String("mango")};
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strCopyArr[i] + " : " + strArr[i]);
		}
		
		System.out.println("strArr의 0번째 과일은 " + strArr[0]);
		System.out.println("strArr의 1번째 과일은 " + strArr[1]);
		System.out.println("strArr의 2번째 과일은 " + strArr[strArr.length - 1]);
		for(int i = 0; i < strArr.length; i++) {
			System.out.println("strArr의 " + i + "번째 과일은 " + strArr[i]);
		}
		
		
		
		
		//IndexOutOfBoundsException
		//System.out.println(strArr[0]);
		

		int[] intArr = new int[3];
		System.out.println(intArr[0]);
		
		int[] intArr2 = new int[] {1, 2, 3};
		int[] intArr3 = {1, 2, 3};
		
		//Student[] studentArr = new Student[];
		
		Student s;
		Student[] stdArray = new Student[3];
		for(int i = 0; i < stdArray.length; i++) {
			stdArray[i] = new Student();
		}
		
		stdArray[0].setAge(15);
		stdArray[0].setName("김영희");
		stdArray[0].setGender('여');
		stdArray[0].setScore(85);
		System.out.println(stdArray[0].getAge());
		System.out.println(stdArray[0].getName());
		System.out.println(stdArray[0].getGender());
		
		System.out.println(stdArray[0].toString());
	}
	
}
