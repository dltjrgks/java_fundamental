import java.util.Scanner;

public class MethodTest03 {
	
	public static double Power(double n, int k) {
		double pow = 1;
		for(int i = 0; i < k; i++) pow *= n;
		return pow;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("°ÅµìÀç°ö : n ^ k");
		System.out.print("½Ç¼ö : ");
		double n = sc.nextDouble();
		
		System.out.print("Á¤¼ö : ");
		int k = sc.nextInt();
		
		System.out.println(n + "ÀÇ " + k + "½ÂÀº " + Power(n,k) + " ÀÔ´Ï´Ù.");
		
		sc.close();
	}
	
	
	
}
