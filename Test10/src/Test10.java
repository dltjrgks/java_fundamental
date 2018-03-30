import java.util.Scanner;


public class Test10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Á¤¼ö ÀÔ·Â :");
		int n = scanner.nextInt();
		
		if(n%2 != 1) {
			System.out.println("Â¦¼ö");
		} else if (n%2 != 0) {
			System.out.println("È¦¼ö");
		}
		
		
		
		scanner.close();
	}
}
