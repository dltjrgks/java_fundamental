import java.util.Scanner;

public class Break02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("���� �Է� (0�� �Է��ϸ� ����)  :  ");
			int num = sc.nextInt();
			sum += num;
			if(num == 0) {
				break;
			}
		}	
		System.out.println("�Է��� ���� �� : " + sum);
		
	//	for(;;) ���ѷ���
	//	for(;true;) ���ѷ���
		
		
		sc.close();
	}
}
