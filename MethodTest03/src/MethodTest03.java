import java.util.Scanner;

public class MethodTest03 {
	
	public static double Power(double n, int k) {
		double pow = 1;
		for(int i = 0; i < k; i++) pow *= n;
		return pow;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ŵ���� : n ^ k");
		System.out.print("�Ǽ� : ");
		double n = sc.nextDouble();
		
		System.out.print("���� : ");
		int k = sc.nextInt();
		
		System.out.println(n + "�� " + k + "���� " + Power(n,k) + " �Դϴ�.");
		
		sc.close();
	}
	
	
	
}
