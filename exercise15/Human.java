package exercise15;

public final class Human extends Earthling {
	public final int id;
	public String name;
	public Status status;

	enum Status {
		HEALTHY, HUNGRY
	}

	public Human(int id, String name) {
		this.id = id;
		this.name = name;
		this.status = Status.HEALTHY;
	}
	
	@Override
	public void move() {
		System.out.println("Human move");
		this.status = Status.HUNGRY;
	}

	@Override
	public final void eat() {
		System.out.println("Human eats");
		this.status = Status.HEALTHY;
	}
	
	public void printStatus() {
		switch (status) {
		case HEALTHY:
			System.out.println("พร้อมจะลุยมานานแล้วววว!!");
			break;
		case HUNGRY:
			System.out.println("หิว ขอข้าวกินหน่อย");
			break;
		}
	}
	
	public static void main(String[] args) {
		//Earthling e = new Earthling(); //Error: Cannot instantiate Earthling object.
		Human a = new Human(100, "AAA");
		System.out.println("Human id: " + a.id + " name: " + a.name);
		//a.id = 0; //Cannot change final variable
		a.name = "BBB";
		System.out.println("Human id: " + a.id + " name: " + a.name);
		
		a.printStatus();
		a.move();
		a.printStatus();
		a.eat();
		a.printStatus();
	}

}
