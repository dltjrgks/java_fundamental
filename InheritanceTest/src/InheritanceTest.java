class Parent {
	int money = 2000000000;
	void apperance() {
		System.out.println("�߻��� �ܸ�");
	}
	
	int getMoney() {
		return this.money;
	}
	
	void character() {
		System.out.println("ȭ���� ����");
	}
	Parent(){}
}

class Child extends Parent {
	Child() {}
	
	
	@Override
	void character() {
		System.out.println("������ ����");
	}
	
	@Override
	void apperance() {
		super.apperance();
		System.out.println("��ĥ�� Ű");
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
		Child boy = new Child();
		
		boy.apperance();
		boy.character();
		System.out.println("����� : " + boy.getMoney());
	}
}
