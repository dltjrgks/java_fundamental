import java.util.Arrays;

public class Array06 {
	public static void main(String[] args) {
		int[] arr1 = { 50, 60, 70, 80, 90 };
		int[] arr2 = new int[5];
		
		
		
		// for �� �̿�
		/*for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}*/
		
		
		// method �̿�
		System.arraycopy(arr1, 1, arr2, 1, 2);
		
		
		// 1�� ��¹��
		/*System.out.print("1�� �迭 : ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%5d", arr1[i]);
		}
		System.out.println();
		System.out.print("2�� �迭 : ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("%5d", arr2[i]);
		}
*/	
		// 2�� ��¹��
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		
	}
}
