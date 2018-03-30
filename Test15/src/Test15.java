import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("메뉴 선택(1 ~ 3) : ");
		
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("파일 읽기");
			break;
		case 2:
			System.out.println("파일 저장");
			break;
		case 3:
			System.out.println("파일 닫기");
			break;
		default :
			System.out.println("파일 읽기 실패");
			break;
				
		}
		
		scanner.close();
	}
}
