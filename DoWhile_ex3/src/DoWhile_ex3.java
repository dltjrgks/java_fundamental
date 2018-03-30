import java.util.Scanner;

public class DoWhile_ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		char next;
		//12 1 2 겨울
		do {
			do {
				System.out.print("계절을 표시합니다. 월 입력(1~12) :");
				month = scanner.nextInt();
			} while(!( 1 <= month && month <= 12));
			switch(month) {
			case 12: case 1: case 2:
				System.out.println(month + " 월은 겨울 입니다.");
				break;
			case 3: case 4: case 5:
				System.out.println(month + " 월은 봄 입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println(month + " 월은 여름 입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(month + " 월은 가을 입니다.");
				break;
			default :	
				System.out.println("다시 입력해주세요(1~12)");
				break;
			}
			// string next = scanner.next();
			// 
			// 이때 비교 방법 next.equals("y")

			System.out.print("한번 더 하시겠습니까?(Y, N) : ");
			next = scanner.next().charAt(0);
			
			if(next == 'N') {
				System.out.println("프로그램을 종료합니다.");
				break;
			} 
			
		} while(next == 'Y');
		//} while(next.equalsIgnoreCase("y");
		scanner.close();
	}

	
}
