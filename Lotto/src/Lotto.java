import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		//lotto[0] = r.nextInt(45) + 1;
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					//lotto[i] = r.nextInt(45) + 1;
					System.out.println("�ٲ�");
					i--;
				}
			}
		}
		
		
		
		System.out.print("���� �Է� (1 ~ 45) : " );
		int k = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < lotto.length; i++) {
			if(lotto[i] == k) {
				System.out.println("������ϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}

		// ���� ����

		for(int i = 0; i < lotto.length -1; i++) {
			boolean checked = false;
			for(int j = 0; j < (lotto.length - 1 - i); j++) {
				if(lotto[j] > lotto[j+1]) {
					int t = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = t;
					checked = true;
				}
				
			}
			if(!checked) break;
		}
		
		System.out.print ("��ȣ : " );
		/*for(int i = 0; i < lotto.length; i++) {
			System.out .print(lotto[i] +  "  ");
		}*/
		System.out.println(Arrays.toString(lotto));
		
		sc.close();
		
		
	}
}
