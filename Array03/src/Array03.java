import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("******학생 성적 처리 프로그램 ( 배열 활용)******");
		System.out.print("학생 수 입력 : ");
		
		int n = sc.nextInt();		
		int sum = 0;
		int[] st = new int[n];
		
		for (int i = 0; i < st.length; i++) {
			System.out.print((i + 1) + " 번 학생의 점수 : ");
			st[i] = sc.nextInt();
			sum += st[i];
		}
		
		System.out.println();
		System.out.println("5명의 합계 : " + sum);
		System.out.println("5명의 평균 : " + (double) sum / st.length);

		sc.close();

	}
}
