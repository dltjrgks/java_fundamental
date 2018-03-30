import java.util.Scanner;

public class MethodTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[5];
		int[] weight = new int[5];
		int[] age = new int[5];
		
		for(int i = 0; i < height.length; i++) {
			System.out.println("--- " + (i+1) + "번째 학생 ---");
			System.out.print("신장 : ");
			height[i] = sc.nextInt();
			System.out.print("체중 : ");
			weight[i] = sc.nextInt();
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
		}
		
		int maxHeight= height[0];
		
		if(maxHeight < height[1]) 	maxHeight = height[1];
		if(maxHeight < height[2]) 	maxHeight = height[2];
		if(maxHeight < height[3]) 	maxHeight = height[3];
		if(maxHeight < height[4]) 	maxHeight = height[4];
		
		int maxWeight= weight[0];
		
		if(maxWeight < weight[1]) 	maxWeight = weight[1];
		if(maxWeight < weight[2]) 	maxWeight = weight[2];
		if(maxWeight < weight[3]) 	maxWeight = weight[3];
		if(maxWeight < weight[4]) 	maxWeight = weight[4];
		
		int maxAge = age[0];
		
		if(maxAge < age[1])	maxAge = age[1];
		if(maxAge < age[2])	maxAge = age[2];
		if(maxAge < age[3])	maxAge = age[3];
		if(maxAge < age[4])	maxAge = age[4];
		
		System.out.println("신장의 최댓값 : " + maxHeight);
		System.out.println("체중의 최댓값 : " + maxWeight);
		System.out.println("나이의 최댓값 : " + maxAge);
		sc.close();
	}
}
