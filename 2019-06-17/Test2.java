import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println(" ù��° ���ڸ� �Է��Ͻÿ�");
		number1 = input.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�");
		number2 = input.nextInt();
		
		if (number1 > number2) {
			System.out.println("�� ���� �� ū ����"+number1);
		}
		else if (number1 == number2) {
			System.out.println("�ΰ��� ���ڰ� �����ϴ�.");
		}
		else {
			System.out.println("�� ���� �� ū ����"+number2);
		}
	}


}