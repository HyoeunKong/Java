import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
	
		int month;
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("�� ���� �˰� ���� ���� �Է��ϼ���^_^");
		month = input.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		System.out.println("31��");
	
		case 2:
		System.out.println("28��");
		break;
		default:
		System.out.println("30��");
		break;
		}
	}

}
}