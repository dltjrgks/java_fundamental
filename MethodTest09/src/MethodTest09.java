import java.util.Arrays;
import java.util.Scanner;

public class MethodTest09 {
	// 1 번 방법
	public static int linearSearch(int[] x, int k) {
		for (int i = 0; i < x.length; i++) {
			if (k == x[i])
				return i;
		}
		return -1;
	}
	// 2 번 방법
	public static int linearSearch2(int[] x , int k) {
		int count = 0;
		for(int i = 0 ; i< x.length; i++) {
			if(x[i] == k) {
				System.out.print((i+1) + " 번 째");
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----선형 검색 프로그램-----");
		System.out.print("배열의 갯수 입력 : ");
		int n = sc.nextInt();
		System.out.print("검색할 값 입력 : ");
		int key = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10) + 1;
		}

		System.out.println(Arrays.toString(a));
		/*		1번 방법
		int findIdx = linearSearch(a, key);

		
		if (findIdx == -1) {
			System.out.println("존재하지않음");
		} else {
			System.out.println("검색한 값은 " + (findIdx + 1) + "번째 있습니다.");
		}
*/
		int count = linearSearch2(a,key);
		if(count == 0) {
			System.out.println("존재하지않음");
		} else {
			System.out.println("있습니다. \n검색한 값은 " + (count) + "개 있습니다.");
		}
		sc.close();
	}
}
