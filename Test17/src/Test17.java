import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		// Ctrl + Shift + o ������ �ڵ����� import
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n = scanner.nextInt();
		// 1��
	  /*for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				System.out.print("*");
			} else {
				System.out.print("+");
			}			
//			System.out.print((i%2 == 0) ? "*" : "+");
			
		}*/
		
		// 2��
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
