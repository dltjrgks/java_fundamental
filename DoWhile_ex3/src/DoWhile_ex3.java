import java.util.Scanner;

public class DoWhile_ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		char next;
		//12 1 2 �ܿ�
		do {
			do {
				System.out.print("������ ǥ���մϴ�. �� �Է�(1~12) :");
				month = scanner.nextInt();
			} while(!( 1 <= month && month <= 12));
			switch(month) {
			case 12: case 1: case 2:
				System.out.println(month + " ���� �ܿ� �Դϴ�.");
				break;
			case 3: case 4: case 5:
				System.out.println(month + " ���� �� �Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println(month + " ���� ���� �Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println(month + " ���� ���� �Դϴ�.");
				break;
			default :	
				System.out.println("�ٽ� �Է����ּ���(1~12)");
				break;
			}
			// string next = scanner.next();
			// 
			// �̶� �� ��� next.equals("y")

			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�?(Y, N) : ");
			next = scanner.next().charAt(0);
			
			if(next == 'N') {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} 
			
		} while(next == 'Y');
		//} while(next.equalsIgnoreCase("y");
		scanner.close();
	}

	
}
