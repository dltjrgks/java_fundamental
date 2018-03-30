class Parent {
	int money = 2000000000;
	void apperance() {
		System.out.println("잘생긴 외모");
	}
	
	int getMoney() {
		return this.money;
	}
	
	void character() {
		System.out.println("화통한 성격");
	}
	Parent(){}
}

class Child extends Parent {
	Child() {}
	
	
	@Override
	void character() {
		System.out.println("차분한 성격");
	}
	
	@Override
	void apperance() {
		super.apperance();
		System.out.println("훤칠한 키");
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
		Child boy = new Child();
		
		boy.apperance();
		boy.character();
		System.out.println("재산은 : " + boy.getMoney());
	}
}
