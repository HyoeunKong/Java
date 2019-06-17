import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		do { System.out.println("정확한 달을 입력하시오[1-12]");
		 i = input.nextInt();
		 
		}while(i<1 || i >12);
		System.out.println(i);
	}

}
