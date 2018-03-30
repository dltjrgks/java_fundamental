import java.util.Scanner;

public class Array2Dtest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행수 입력 : ");
		int h = sc.nextInt();

		System.out.print("열수 입력 : ");
		int w = sc.nextInt();

		int[][] arr = new int[h][w];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				arr[i][j] = (int) (Math.random() * 90 + 10);
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}
}
