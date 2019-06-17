import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		int j;
		long x = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		j = input.nextInt();
		for(int i=1 ; i <= j; i++) {
			x = i * x;
		}
		System.out.println(j+"!값은"+x+"입니다.");
	}

}
