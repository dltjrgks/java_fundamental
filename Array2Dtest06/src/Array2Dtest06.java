import java.util.Scanner;

public class Array2Dtest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[4][5];
		String str;
		int result;
		
		
		do {
			result = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = (int) (Math.random() * 45 + 1);
				}
			}

			System.out.print("행운의 수 입력 (1 ~ 45) :");

			int k = sc.nextInt();
			

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] == k) {
						result++;
					}
				}
			}

			System.out.println("배열");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.printf("%3d", a[i][j]);
				}
				System.out.println();
			}

			System.out.println();
			System.out.println(k + "의 갯수 : " + result);
			System.out.println();

			switch (result) {
			case 0:
				System.out.println("보통 날 입니다.");
				break;
			case 1:
				System.out.println("괜찮은 날 입니다.");
				break;
			case 2:
				System.out.println("운이 좋은 날 입니다.");
				break;
			case 3:
				System.out.println("운수 대통인 날 입니다.");
				break;
			case 4:
				System.out.println("대박인 날 입니다.");
				break;
			default:
				System.out.println("완전 대박");
				break;
			}

			System.out.print("다시 하시겠습니까? (Y/N) :");
			str = sc.next();
			if (str.equals("N")) {
				System.out.println("종료");
				break;
			}
			
			/*if(result == 8) {
				System.out.println(n);
				break;
			}*/
		} while (str.equals("Y")); /*str.equals("Y")*/

		sc.close();
	}
}
