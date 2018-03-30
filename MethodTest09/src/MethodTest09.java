import java.util.Arrays;
import java.util.Scanner;

public class MethodTest09 {
	// 1 �� ���
	public static int linearSearch(int[] x, int k) {
		for (int i = 0; i < x.length; i++) {
			if (k == x[i])
				return i;
		}
		return -1;
	}
	// 2 �� ���
	public static int linearSearch2(int[] x , int k) {
		int count = 0;
		for(int i = 0 ; i< x.length; i++) {
			if(x[i] == k) {
				System.out.print((i+1) + " �� °");
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----���� �˻� ���α׷�-----");
		System.out.print("�迭�� ���� �Է� : ");
		int n = sc.nextInt();
		System.out.print("�˻��� �� �Է� : ");
		int key = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10) + 1;
		}

		System.out.println(Arrays.toString(a));
		/*		1�� ���
		int findIdx = linearSearch(a, key);

		
		if (findIdx == -1) {
			System.out.println("������������");
		} else {
			System.out.println("�˻��� ���� " + (findIdx + 1) + "��° �ֽ��ϴ�.");
		}
*/
		int count = linearSearch2(a,key);
		if(count == 0) {
			System.out.println("������������");
		} else {
			System.out.println("�ֽ��ϴ�. \n�˻��� ���� " + (count) + "�� �ֽ��ϴ�.");
		}
		sc.close();
	}
}
