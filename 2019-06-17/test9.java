import java.util.*;
public class test9 {

	public static void main(String[] args) {
		int x, y, r;
		System.out.println("�� ������ �Է��Ͻÿ�(ū��,������");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		while(y!=0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("�ִ� �������"+x);
	}

}
