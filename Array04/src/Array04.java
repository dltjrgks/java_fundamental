//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class Array04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Random r = new Random();
		
		int[] a = new int[10];
		
		
		System.out.println("�ִ�, �ּڰ� ���ϴ� ���α׷�");
		
		// ������ ���� �Է�
/*		for(int i = 0; i < a.length; i++) {
			System.out.print( i + 1 + " ��° ���� �Է� : ");
			a[i] = sc.nextInt(); 
		}*/
		// ������ ������ �����ϴ� ���
		System.out.print("[");
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		int max = a[0];
		int min = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) max = a[i];
			if(min > a[i]) min = a[i];
		}
		
		System.out.println();
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);
		sc.close();
	}
}