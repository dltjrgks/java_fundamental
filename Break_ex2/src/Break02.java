import java.util.Scanner;

public class Break02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("정수 입력 (0을 입력하면 종료)  :  ");
			int num = sc.nextInt();
			sum += num;
			if(num == 0) {
				break;
			}
		}	
		System.out.println("입력한 값의 합 : " + sum);
		
	//	for(;;) 무한루프
	//	for(;true;) 무한루프
		
		
		sc.close();
	}
}
