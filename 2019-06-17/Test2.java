import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println(" 첫번째 숫자를 입력하시오");
		number1 = input.nextInt();
		System.out.println("두 번째 숫자를 입력하시오");
		number2 = input.nextInt();
		
		if (number1 > number2) {
			System.out.println("둘 중의 더 큰 수는"+number1);
		}
		else if (number1 == number2) {
			System.out.println("두개의 숫자가 같습니다.");
		}
		else {
			System.out.println("둘 중의 더 큰 수는"+number2);
		}
	}


}