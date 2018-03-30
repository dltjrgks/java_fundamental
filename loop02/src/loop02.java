import java.util.Scanner;

public class loop02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		/*for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		
		
		/*int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print("* ");
				j++;
			} while(j <= i);
			System.out.println();
			i++;
		} while(i <= n);
		
		
		
		
		
		
		
		sc.close();
	}
}
