package kh.lclass;

public class TestGetterSetter {
	int abc1;
	long abc2;
	String abc3;
	float abc4;
	double abc5;
	
	//getter /setter
	
	public int getAbc1(/*매개인자가 없어도 됨*/) {
		return this.abc1;
	}
	
	public void setAbc1(int abc1/*대입할 값을 담을 매개변수선언*/) {
		this.abc1 = abc1;
	}
	
	public long getAbc2() {
		return this.abc2;
	}
	
	public void setAbc2(long abc2) {
		this.abc2 = abc2;
	}
	
	public String getAbc3() {
		return this.abc3;
	}
	
	public void setAbc3(String abc3) {
		this.abc3 = abc3;
	}
	
	public float getAbc4() {
		return this.abc4;
	}
	
	public void setAbc4(float abc4) {
		this.abc4 = abc4;
	}
	
	public double getAbc5() {
		return this.abc5;
	}
	
	public void setAbc5(double abc5) {
		this.abc5 = abc5;
	}
}
