
public class GugudanTest {
	public static void main(String[] args) {
		// 1�� for�� Ȱ��
		/*for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}*/
		
		// 2�� while�� Ȱ��
		int i = 2, j = 1;
		/*
		while (i <= 9) {
			while(j <= 9) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
			j = 1;
			System.out.println("");
			i++;
		}*/ 
		
		// 3�� do-while�� Ȱ��	
		do {
			do {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}while (j <= 9);
			j = 1;
			i++;
			System.out.println();
		} while(i <= 9);
		
		
		
		
	}
}
