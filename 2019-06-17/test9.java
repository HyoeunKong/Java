import java.util.*;
public class test9 {

	public static void main(String[] args) {
		int x, y, r;
		System.out.println("두 정수를 입력하시오(큰수,작은수");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		while(y!=0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("최대 공약수는"+x);
	}

}
