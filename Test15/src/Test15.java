import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�޴� ����(1 ~ 3) : ");
		
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("���� �б�");
			break;
		case 2:
			System.out.println("���� ����");
			break;
		case 3:
			System.out.println("���� �ݱ�");
			break;
		default :
			System.out.println("���� �б� ����");
			break;
				
		}
		
		scanner.close();
	}
}
