import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1 ~ 12) ? ");
		
		int month = scanner.nextInt();
		// 1
//		if (month >= 13 || month < 0) {
//			System.out.println("��");
//		} else if( 3 <= month  && month <= 5) {
//			System.out.println("���Դϴ�.");
//		} else if (6 <= month && month <= 8) {
//			System.out.println("�����Դϴ�.");
//		} else if (month >= 9 && month <= 11) {
//			System.out.println("�����Դϴ�.");
//		} else if (month <= 2 || month == 12) {
//			System.out.println("�ܿ��Դϴ�.");
//		}
		//2
//		if(month == 3 || month == 4 || month == 5) {
//			System.out.println("���Դϴ�");
//		} else if(month == 6 || month == 7 || month == 8) {
//			System.out.println("�����Դϴ�");
//		} else if(month == 9 || month == 10 || month == 11) {
//			System.out.println("�����Դϴ�");
//		} else if(month == 12 || month == 1 || month == 2) {
//			System.out.println("�ܿ��Դϴ�");
//		} else 
		//3
		switch(month) {
		case 3 : case 4 : case 5 :
			System.out.println("���Դϴ�.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("�����Դϴ�");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("���� �Դϴ�");
			break;
		default :
			System.out.println("�ܿ� �Դϴ�");
			break;
			 
		}
		
		scanner.close();
	}
}
