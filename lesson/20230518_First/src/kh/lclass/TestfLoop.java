package kh.lclass;

import java.util.Scanner;

public class TestfLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요. 정수 0~200 : ");
		int age = sc.nextInt();
		
		if (age >= 8 && age <= 19) {
			System.out.println("학교에 다닙니다.");
			if(age == 8 ) {
				System.out.println("학교에 입학하였습니다.");
			} else if (age == 19) {
				System.out.println("곧 졸업합니다.");
			}
		} else {
			System.out.println("학교를 다니지 않습니다.");
		}
		
		System.out.println("======================================");
		System.out.println("공원입장료");
		System.out.print("나이를 입력해주세요 : ");
		int age1 = sc.nextInt();
		int charge;
		if(age1 < 8) {
			charge = 1000;
		} else if(age1 < 14) {
			charge = 2000;
		} else if(age1 < 20) {
			charge = 2500;
		} else {
			charge = 3000;
		}
		System.out.println("나이가 " + age1 + "살 이므로, 공원입장료는 " + charge + "원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
