import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1 ~ 12) ? ");
		
		int month = scanner.nextInt();
		// 1
//		if (month >= 13 || month < 0) {
//			System.out.println("모름");
//		} else if( 3 <= month  && month <= 5) {
//			System.out.println("봄입니다.");
//		} else if (6 <= month && month <= 8) {
//			System.out.println("여름입니다.");
//		} else if (month >= 9 && month <= 11) {
//			System.out.println("가을입니다.");
//		} else if (month <= 2 || month == 12) {
//			System.out.println("겨울입니다.");
//		}
		//2
//		if(month == 3 || month == 4 || month == 5) {
//			System.out.println("봄입니다");
//		} else if(month == 6 || month == 7 || month == 8) {
//			System.out.println("여름입니다");
//		} else if(month == 9 || month == 10 || month == 11) {
//			System.out.println("가을입니다");
//		} else if(month == 12 || month == 1 || month == 2) {
//			System.out.println("겨울입니다");
//		} else 
		//3
		switch(month) {
		case 3 : case 4 : case 5 :
			System.out.println("봄입니다.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름입니다");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을 입니다");
			break;
		default :
			System.out.println("겨울 입니다");
			break;
			 
		}
		
		scanner.close();
	}
}
