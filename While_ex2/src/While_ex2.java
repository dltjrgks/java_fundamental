
public class While_ex2 {
	public static void main(String[] args) {
	/*	int sum = 0, i = 1;
		
		while(true) {
			sum += i;
			if(sum >= 100) {
				sum-=i;
				i--;
				break;
			}
			i++;
		}
		System.out.println("Sum = " + sum);
		System.out.println("Ƚ�� : " +  i);*/
		
		int i = 1, sum = 0;
		
		while(sum+i < 100) {
			sum += i;
			System.out.println("1���� " + i + "������ ���� " + sum + "�Դϴ�.");
			i++;
		}
		
		
	}
}
