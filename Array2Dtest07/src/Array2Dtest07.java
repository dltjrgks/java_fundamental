import java.util.Scanner;

// 학번  국 영 수 총점 평균 석차
public class Array2Dtest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();

		int[][] a = new int[n][7];
		String[] subject = { "", "국어", "영어", "수학"};
		//String[] title = {"NO", "KOR", "ENG", "MAT", "SUM", "AVG", "RANK"};
		
		// 성적 입력
		for (int i = 0; i < a.length; i++) {
			System.out.println("학생 " + (i + 1) + "의 정보");
			for (int j = 0; j < a[i].length; j++) {
				switch(j) {
				case 0 :
					a[i][j] = i + 1;
					break;
				case 1 :
					System.out.print(subject[j] + "점수 입력 : ");
					int kor = sc.nextInt();
					a[i][j] = kor;
					break;
				case 2 :
					System.out.print(subject[j] + "점수 입력 : ");
					int eng = sc.nextInt();
					a[i][j] = eng;
					break;
				case 3 :
					System.out.print(subject[j] + "점수 입력 : ");
					int math = sc.nextInt();
					a[i][j] = math;
					break;
				case 4 :
					System.out.print("총점 : ");
					for(int k = 1; k < 4; k++) {
						a[i][j] += a[i][k];
					}
					System.out.println(a[i][j]);
					break;
				case 5 :
					a[i][j] = (int)(a[i][j-1]/3);
					System.out.print("평균 : " + a[i][j]);
				}
			}
			System.out.println();
			System.out.println();

		}
		
		
		// 석차
		for(int i = 0; i < a.length; i++) {
			a[i][6] = 1;
			for(int j = 0; j < a.length; j++) {
				if(a[i][4] < a[j][4]) {
					a[i][6]++;
				}
			}
		}
		
		// 결과 출력
		//for(int i = 0; i < title.length; i++) 
			//System.out.printf("%6d", title[i]);
		
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%6d", a[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
