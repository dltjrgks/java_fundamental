import java.util.Scanner;


public class Test13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max, min;
		
		System.out.print("���� �Է� 1 : ");
		int n1 = scanner.nextInt();
		
		System.out.print("���� �Է� 2 : ");
		int n2 = scanner.nextInt();
		
		System.out.print("���� �Է� 3 : ");
		int n3 = scanner.nextInt();
		
		max = min = n1;
		
		if(max < n2) {
			max = n2;
		} 
		
		if(max < n3) {
			max = n3;
		}
		
		if(min > n2) {
			min = n2;
		} 
		
		if(min > n3) {
			min = n3;
		}
	
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
				
		scanner.close();
	}
}
