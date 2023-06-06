package kh.lclass.oop.sample;

public abstract class Driver {
	private int license;
	private int money;

	// 자동차 구매
	public void buy(Car c) {
		if (money > c.getPrice()) {
			if (c instanceof Sonata) {
				((Sonata)c).moveSonata();
				System.out.println("Sonata 이벤트에 응모되었습니다.");
			}
			if(c instanceof Car) {
				System.out.println("Car 이벤트에 응모되었습니다.");
			}
			System.out.println(c.getPrice() + "원에 구매확정");
			money = money - c.getPrice();
		} else {
			System.out.println("잔액 부족! . 현재 잔액은 " + money);
		}

	}

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 드라이브
	public void driving() {

	}
}
