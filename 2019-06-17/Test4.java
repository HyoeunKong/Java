import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		int grade;

		Scanner input = new Scanner(System.in);

		System.out.println("������ �Է��Ͻÿ�");
		grade = input.nextInt();
		
		if (grade >= 90) {
			System.out.println("������ A�Դϴ�.");
		}
		else if(grade >= 80) {
			System.out.println("������ B�Դϴ�.");
		}
		else if(grade >= 70) {
			System.out.println("������ C�Դϴ�.");
		}
		else if(grade >= 60) {
			System.out.println("������ D�Դϴ�.");
		}
		else {
				System.out.println("������ F�Դϴ�.");
			}
		}
	}
