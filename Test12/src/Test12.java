import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor, eng, math;
		int score;
		double avg;
		
		System.out.print("국어 점수:");
		kor = scanner.nextInt();
		
		System.out.print("영어 점수:");
		eng = scanner.nextInt();
		
		System.out.print("수학 점수:");
		math = scanner.nextInt();
		
		
		score = kor + eng + math;
		avg = (double)(kor + eng + math)/3;
		
		System.out.println("총점 : " + score);
		System.out.println("평균 : " + avg);
		
		String _score;
		// 1
		/*if(avg >= 90) {
			_score = "A";
		} else if (avg >= 80) {
			_score = "B";
		} else if (avg >= 70) {
			_score = "C";
		} else if (avg >= 60) {
			_score = "D";
		} else {
			_score = "F";
		}*/
		//2
		
		switch (score/3) {
		case 100:
		case 90 :
			_score = "A";
			break;
		case 80 :
			_score = "B";
			break;
		case 70 :
			_score = "C";
			break;
		case 60 :
			_score = "D";
			break;
		default :
			_score = "F";
			break;
		}
		
		
		
		
		System.out.println("학점 : " + _score);
		scanner.close();
	}
}
