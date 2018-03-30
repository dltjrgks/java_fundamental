
public class SelectionSort01 {
	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30,22, 99,77, 55, 44};
		
		System.out.print("선택 정렬 전 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for(int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println();
		System.out.print("선택 정렬 후 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
