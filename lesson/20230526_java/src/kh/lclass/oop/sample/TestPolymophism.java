package kh.lclass.oop.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestPolymophism {
	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<Car>();
		ArrayList<Car> carArrayList = new ArrayList<Car>(); //가장 흔하게 선언하는 방식
		Collection<Car> carCollection = new ArrayList<Car>(); 
		
		TestInterface kh = new kh();
		kh kh2 = new kh();
		
		((kh)kh).khSpecial();
		kh2.khSpecial();
		
		Driver ej= new DriverSub();
		ej.setMoney(5000);
		ej.buy(new Avante());
		ej.buy(new Sonata());
		Driver jh = new Driver2Sub();
		jh.setMoney(10000);
		jh.buy(new Avante());
		jh.buy(new Sonata());
	}
}
