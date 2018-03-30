import java.util.Scanner;

public class MethodTest02 {
	public static int max(int a, int b, int c) {
		int max = a;

		if (max < b)
			max = b;
		if (max < c)
			max = c;

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];

		for (int i = 0; i < height.length; i++) {
			System.out.println("--- " + (i + 1) + "번 학생 ---");
			System.out.print("신장 입력 : ");
			height[i] = sc.nextInt();
			System.out.print("체중 입력 : ");
			weight[i] = sc.nextInt();
			System.out.print("나이 입력 : ");
			age[i] = sc.nextInt();
		}
		// 메소드 호출
		int maxHeight = max(height[0], height[1], height[2]);
		int maxWeight = max(weight[0], weight[1], weight[2]);
		int maxAge = max(age[0], age[1], age[2]);

		System.out.println("신장의 최댓값 : " + maxHeight);
		System.out.println("체중의 최댓값 : " + maxWeight);
		System.out.println("나이의 최댓값 : " + maxAge);
		sc.close();
	}
}


/*
 * 			<메소드의 규칙>
 * 1. 매개 변수의 갯수와 타입은 반드시 같아야한다.
 * 2. 리턴 값은 반드시 1개 또는 0개여야한다.
 * 3. 리턴 값과 리턴 타입은 반드시 일치해야한다.
 */













