class Car {
	String color;
	String gearType;
	int door;
	int serialNo;
	static int count = 0;
	//인스턴스 초기자
	{
		serialNo = ++count;
	}
	Car() {
		// door = 2;
		this("black", "auto", 4);
		
	}

	Car(String color) {
		this(color, "auto", 4);
		
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		//serialNo = count++;
	}

	Car(Car c) {

		this(c.color, c.gearType, c.door);
		/*
		 * this.color = c.color; 
		 * this.gearType = c.gearType; 
		 * this.door = c.door;
		 */
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;

		Car c2 = new Car("red", "manual", 2);

		Car c3 = new Car("blue");

		Car c4 = new Car(c3);

		System.out.println("c1의 color : " + c1.color +", serialNo : " + c1.serialNo + ", gearType : " + c1.gearType + ", door : " + c1.door);

		System.out.println("c2의 color : " + c2.color +", serialNo : " + c2.serialNo + ", gearType : " + c2.gearType + ", door : " + c2.door);

		System.out.println("c3의 color : " + c3.color +", serialNo : " + c3.serialNo + ", gearType : " + c3.gearType + ", door : " + c3.door);

		System.out.println("c4의 color : " + c4.color +", serialNo : " + c4.serialNo + ", gearType : " + c4.gearType + ", door : " + c4.door);
	}
}
