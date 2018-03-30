import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		// Ctrl + Shift + o 누르면 자동으로 import
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = scanner.nextInt();
		// 1번
	  /*for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				System.out.print("*");
			} else {
				System.out.print("+");
			}			
//			System.out.print((i%2 == 0) ? "*" : "+");
			
		}*/
		
		// 2번
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
//			System.out.println(i);
			if(i != n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
//			if(i < n)  {
//				System.out.println(" + ");
//			}
		}
//		System.out.println(" = " + sum);
		
		
		scanner.close();
		
	}
}
