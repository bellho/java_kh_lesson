package kh.lclass.thread.run;

import kh.lclass.thread.ThreadAaa;
import kh.lclass.thread.ThreadBbb;

public class Run {

	public static void main(String[] args) {
//		Runnable ta = new ThreadAaa();
		Thread ta = new Thread(new ThreadAaa()); 	//Runnable을 이용한 방법
		Thread tb = new ThreadBbb();					//Thread를 직접적으로 이용한 방법
		ta.setPriority(9);
		ta.start();
		
		tb.setPriority(1);
		tb.start();
		
		Thread tbb = new ThreadBbb();
		tbb.start();
		
//		for(int i = 0; i < 500; i++) {
//			System.out.println(i + "*");
//		}
//		System.out.println("main main main main main main main");
	}

}
