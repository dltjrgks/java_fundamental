import java.util.Scanner;


public class Test10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է� :");
		int n = scanner.nextInt();
		
		if(n%2 != 1) {
			System.out.println("¦��");
		} else if (n%2 != 0) {
			System.out.println("Ȧ��");
		}
		
		
		
		scanner.close();
	}
}
