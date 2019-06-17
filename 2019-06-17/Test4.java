import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		int grade;

		Scanner input = new Scanner(System.in);

		System.out.println("성적을 입력하시오");
		grade = input.nextInt();
		
		if (grade >= 90) {
			System.out.println("학점은 A입니다.");
		}
		else if(grade >= 80) {
			System.out.println("학점은 B입니다.");
		}
		else if(grade >= 70) {
			System.out.println("학점은 C입니다.");
		}
		else if(grade >= 60) {
			System.out.println("학점은 D입니다.");
		}
		else {
				System.out.println("학점은 F입니다.");
			}
		}
	}
