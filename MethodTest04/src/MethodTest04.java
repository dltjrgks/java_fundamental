import java.util.Scanner;

public class MethodTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("--- �޼ҵ�� ������ ��ǥ ��� ---" );
		System.out.print("���� �Է� :");
		int n = sc.nextInt();
		
		/*for(int i = 1; i <= n; i ++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		*/
		
		for(int i = 1; i <= n; i++) {
			DrawStar(i);
			
		}

		sc.close();
	}
	
	public static void DrawStar(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
}
