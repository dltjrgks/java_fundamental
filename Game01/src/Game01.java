import java.util.Scanner;

public class Game01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = { "����", "����", "��" };
		int[] score = new int[3];
		String retry;
		System.out.println("***���� ���� �� ����***");

		do {
			System.out.print("���� �Է� (0-����, 1-����, 2-��) : ");
			int user = sc.nextInt();
			int com = (int) (Math.random() * 3);

			System.out.println("������ " + s[user] + " �̰�, ��ǻ�ʹ� " + s[com] + " �Դϴ�.");

			int result = (user - com + 3) % 3;

			switch (result) {
			/* case -2 : */ case 1:
				System.out.println("User�� �¸��Ͽ����ϴ�.");
				score[1]++;
				break;
			/* case -1 : */ case 2:
				System.out.println("Computer�� �¸��Ͽ����ϴ�.");
				score[2]++;
				break;
			case 0:
				System.out.println("�����ϴ�.");
				score[0]++;
				break;
			}
			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�? (Y/N) : ");
			retry = sc.next();
			System.out.println();
			System.out.println();
			if(retry.equals("N")) break;
		} while (retry.equals("Y"));
		
		System.out.println("�� : " + score[1] + " ��  : " + score[2] + " ���º� : " + score[0]);
		
		sc.close();
	}
}
