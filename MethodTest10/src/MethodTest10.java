import java.util.Arrays;
import java.util.Scanner;

public class MethodTest10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� �� �Է� :");
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(a));

		/*
		 * for (int i = 0; i < a.length / 2; i++) { int tmp = a[i]; a[i] = a[a.length -
		 * 1 - i]; a[a.length - 1 - i] = tmp; }
		 */
		
		reverse(a);
		System.out.println(Arrays.toString(a));
		sc.close();

	}

	public static int[] reverse(int[] x) {
		for (int i = 0; i < x.length / 2; i++) {
			/*
			 * int tmp = x[i]; 
			 * x[i] = x[x.length - 1 - i]; 
			 * x[x.length - 1 - i] = tmp;
			 */
			swap(x, i, x.length - 1 - i);
		}
		return x;
	}
// �迭�� ���� ��� - �迭�� �Ű������� �����;���
	public static void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}
}
