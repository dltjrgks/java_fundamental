import java.util.Arrays;

public class Array06 {
	public static void main(String[] args) {
		int[] arr1 = { 50, 60, 70, 80, 90 };
		int[] arr2 = new int[5];
		
		
		
		// for 문 이용
		/*for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}*/
		
		
		// method 이용
		System.arraycopy(arr1, 1, arr2, 1, 2);
		
		
		// 1번 출력방법
		/*System.out.print("1번 배열 : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%5d", arr1[i]);
		}
		System.out.println();
		System.out.print("2번 배열 : ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("%5d", arr2[i]);
		}
*/	
		// 2번 출력방법
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		
	}
}
