import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 개수 입력 : ");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = (int) (Math.random()*100) + 1;	// 0 ~ 44 까지의 난수 + 1
			for(int j = 0; j < i; j++) {
				if(a[j] == a[i]) {
					i--;
					break;
				}
			}
			
			
		}
		System.out.print("버블 정렬 전 : ");
		System.out.println(Arrays.toString(a));
		
		
		for(int i = 0; i < n-1; i++) {
			boolean checked = false;
			for(int j = 0; j < n - i - 1; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					checked = true;
				}
			}
			System.out.print("  " + (i + 1) + " 회전 후 : ");
			System.out.println(Arrays.toString(a));
			if(!checked) break;
		}
		
		System.out.print("버블 정렬 후 : ");
		System.out.println(Arrays.toString(a));
		
		sc.close();
	}
}
