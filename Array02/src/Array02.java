
public class Array02 {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		a[1] = 10;
		a[3] = 30;
		
		//a.length = 10;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
