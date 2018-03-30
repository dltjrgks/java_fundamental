
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
		System.out.println("횟수 : " +  i);*/
		
		int i = 1, sum = 0;
		
		while(sum+i < 100) {
			sum += i;
			System.out.println("1부터 " + i + "까지의 합은 " + sum + "입니다.");
			i++;
		}
		
		
	}
}
