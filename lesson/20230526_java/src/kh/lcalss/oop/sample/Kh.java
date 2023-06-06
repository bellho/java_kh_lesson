package kh.lcalss.oop.sample;

import kh.lclass.collection.Car;

public class Kh {
	public void khSpecial() {
		Car[] carArr = new Car[3];
		String str = null;
		try {
			System.out.println("1");
			carArr[4].setPrice(5000);
			System.out.println("2");
			carArr[0].setPrice(5000);
			int a = Integer.parseInt(str);
			int c = 10 / 0;
			c = 0 / 10;
		} catch (NullPointerException e) {
			System.out.println("얘기치 못한 오류가 일어났습니다. 잠시 후에 다시 시도해주십시오.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터 범위를 벗어났습니다.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println();
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println();
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
