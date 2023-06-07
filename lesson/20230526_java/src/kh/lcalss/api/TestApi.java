package kh.lcalss.api;



import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

import kh.lcalss.vo.TestVo;
import static kh.lcalss.api.khCommomApi.*;

public class TestApi {
	public void testDate() {
		Date when = new Date();
		System.out.println(when);

		Calendar c = new GregorianCalendar(); //Cannot instantiate the type Calendar
		
		Calendar c2 = Calendar.getInstance();
		
		TestSingleton ts = TestSingleton.getInstance();
		System.out.println(ts.getA());
		ts.setA(50);
		System.out.println(ts.getA());

		TestSingleton ts2 = TestSingleton.getInstance();
		System.out.println(ts2.getA());
		ts2.setA(100);
		System.out.println(ts.getA());

		
		
		
		System.out.println(c.getTime());
	}
	
	
	
	public void testWrapperDoWhile() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("메뉴 1-5 사이 선택해주세요.");
			int menu = 0;
			try {
				String menuStr = sc.nextLine();
				menu = Integer.parseInt(menuStr);
				
			} catch(NumberFormatException e) {}
			
			if (!(checkMenu(1, 5, menu))) {
				continue;
			} else {
				// 비정상 케이스
				System.out.println("정상적으로 입력 되어서... 다른 함수 호출함.");
				testString();
				System.out.println("동작 마침!!!");
				break;
			}
		}
		
		System.out.println("testWrapperDoWhile 끝");
		
		
//		while (true) {
//			System.out.println("메뉴 1-5 사이 선택해주세요.");
//			int menu = sc.nextInt();
//
//			if (menu > 0 && menu < 6) {
//				// 정상 케이스
//				System.out.println("정상적으로 입력 되어서... 다른 함수 호출함.");
//				testString();
//				System.out.println("동작 마침!!!");
//				break;
//			} else {
//				// 비정상 케이스
//				System.out.println("1-5 사이 선택해주세요.");
//			}
//		}
//		
//		System.out.println("testWrapperDoWhile 끝");
	}

	public void testString() {
		StringBuffer str1 = new StringBuffer("aaa");
		StringBuffer str2 = new StringBuffer();
		str2.append("12345");
		str2.insert(2, "abc");
		System.out.println(str2);
		System.out.println(str2.indexOf("bc"));
		StringBuilder str3 = new StringBuilder("bbb");
		str3.insert(1, "1111");
		System.out.println(str3);

		String str = "AA|BB|CC";
		StringTokenizer st = new StringTokenizer(str, "|");
		while (st.hasMoreTokens())	 {
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
		}

		Scanner sc = new Scanner(System.in);
		System.out.println();
		String token = sc.nextLine();
		System.out.println();
		String content = sc.nextLine();
		System.out.println();
		StringTokenizer st1 = new StringTokenizer(token, content);
		System.out.println(st1);

		// 기본자료형 -> String;
		int num = 35;
		double num2 = 35.0;
		String s3 = String.valueOf(num2);
		String s4 = Double.valueOf(num2).toString();
		String s1 = String.valueOf(num);
		String s2 = Integer.valueOf(num).toString();

		// String -> 기본자료형;
		String s = "35";
		num = Integer.parseInt(s);

		System.out.println(num);
		System.out.println(35);
		System.out.println(35 + ":");

//		int bnum1 = 10;
//		int bnum2 = 11;
//		String bcontent2 = "aaaa";
//		String bwriter1 = "aa";
//		bwriter1 = "bb";
//		
//		TestVo tvo2 = new TestVo();
	}

}
