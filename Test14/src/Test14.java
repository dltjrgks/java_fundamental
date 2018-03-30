import java.util.Scanner;


public class Test14 {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("정수 입력 1 : ");
	 int a = scanner.nextInt();
	 
	 System.out.print("정수 입력 2 : ");
	 int b = scanner.nextInt();
	 
	 int t;
	 
	 //a 작은수 b 큰수
	 if(a > b) {
		 t = a;
		 a = b;
		 b = t;
	 }
	 System.out.println("a : " + a);
	 System.out.println("b : " + b);	 
	 
	 scanner.close();
 }
}
