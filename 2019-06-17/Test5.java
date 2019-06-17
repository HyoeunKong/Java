import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
	int grade;
	int grade2;
	Scanner input = new Scanner(System.in);
	
	while(true) {
	System.out.println("점수를 입력하시오");
	grade = input.nextInt();
	grade2 = grade/10;

	switch(grade2) {
	case  10:
	case  9:
		System.out.println("A");
		break;
	
	case 8:
		System.out.println("B");
		break;
	case 7:
		System.out.println("C");
		break;
	case 6:
		System.out.println("D");
		break;
	default:
		System.out.println("F");
		break;
		}

	}
 } 
}