class Tv {

	// 멤버 변수
	String color;
	boolean power;
	int channel;

	// 멤버 메소드
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv();

		tv1.color = "red";
		tv1.power();
		// tv1.power = true;

		tv1.channel = 9;
		tv1.channelUp();
		tv1.channelUp();

		System.out.println("tv1의 색상은 : " + tv1.color);
		System.out.println("tv1의 전원은 : " + (tv1.power == true ? "ON" : "OFF"));
		System.out.println("tv1의 채널은 : " + tv1.channel);
		
		System.out.println();
		
		Tv tv2 = new Tv();
		
		tv2.channel = 15;
		tv2.color = "black";
		tv2.power();
		
		tv2.channelUp();
		
		System.out.println("tv2의 색상은 : " + tv2.color);
		System.out.println("tv2의 전원은 : " + (tv2.power == true ? "ON" : "OFF"));
		System.out.println("tv2의 채널은 : " + tv2.channel);
		
		
		// 참조변수의 변경
		System.out.println();
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t2 = t1; // t1 이 참조하는 곳을 t2 도 참조하게 한다.
		
		t1.channel = 7;
		
		System.out.println("t1의 채널 값은 : " + t1.channel);
		System.out.println("t2의 채널 값은 : " + t2.channel);
		
		
		

	}
}
