import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor, eng, math;
		int score;
		double avg;
		
		System.out.print("���� ����:");
		kor = scanner.nextInt();
		
		System.out.print("���� ����:");
		eng = scanner.nextInt();
		
		System.out.print("���� ����:");
		math = scanner.nextInt();
		
		
		score = kor + eng + math;
		avg = (double)(kor + eng + math)/3;
		
		System.out.println("���� : " + score);
		System.out.println("��� : " + avg);
		
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
		
		
		
		
		System.out.println("���� : " + _score);
		scanner.close();
	}
}
