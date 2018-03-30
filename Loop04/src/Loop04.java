import java.util.Scanner;

public class Loop04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		/*for (int i = 0; i < n; i++) {
			
			for(int k = 0; k < i; k++) {
				System.out.print("  ");
			}
			
			for(int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}*/
		// if 문 활용
		/*for(int i = 0; i < n; i++) {
			for(int k = 0; k < n - 1 - i; k++ ) {
				System.out.print("  ");
			}
					
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j < n - i- 1) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
								
		
		
		sc.close();
	}
}