import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***정사각형 만드는 프로그램***");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		// 1번 for
		/*for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		
		// 2번 while
		/*int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		// 3번 do - while
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print("* ");
				j++;
			} while(j <= n);
			
			System.out.println();
			i++;
		} while (i <= 5);
		
		
		sc.close();
	}
}
