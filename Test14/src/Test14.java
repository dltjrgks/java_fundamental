import java.util.Scanner;


public class Test14 {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("���� �Է� 1 : ");
	 int a = scanner.nextInt();
	 
	 System.out.print("���� �Է� 2 : ");
	 int b = scanner.nextInt();
	 
	 int t;
	 
	 //a ������ b ū��
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
