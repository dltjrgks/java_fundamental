import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else if(n < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		} else if (n == 0) {
			System.out.println("0 입니다.");
		}
		
		sc.close();
	}
}
