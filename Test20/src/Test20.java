import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***���簢�� ����� ���α׷�***");
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		// 1�� for
		/*for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		
		// 2�� while
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
		
		// 3�� do - while
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
