package kh.lclass.thread;

public class ThreadBbb extends Thread{
	public void run() {
		for(int i = 2; i < 101; i ++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("### %3d*%2d\n", i , j, i*j);
			}System.out.println("===");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}System.out.println("bbbbbbbbbbbbbbbbbbbbb");
	}

}
