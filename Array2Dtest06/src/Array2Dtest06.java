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

			System.out.print("����� �� �Է� (1 ~ 45) :");

			int k = sc.nextInt();
			

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] == k) {
						result++;
					}
				}
			}

			System.out.println("�迭");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.printf("%3d", a[i][j]);
				}
				System.out.println();
			}

			System.out.println();
			System.out.println(k + "�� ���� : " + result);
			System.out.println();

			switch (result) {
			case 0:
				System.out.println("���� �� �Դϴ�.");
				break;
			case 1:
				System.out.println("������ �� �Դϴ�.");
				break;
			case 2:
				System.out.println("���� ���� �� �Դϴ�.");
				break;
			case 3:
				System.out.println("��� ������ �� �Դϴ�.");
				break;
			case 4:
				System.out.println("����� �� �Դϴ�.");
				break;
			default:
				System.out.println("���� ���");
				break;
			}

			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (Y/N) :");
			str = sc.next();
			if (str.equals("N")) {
				System.out.println("����");
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
