import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 0;
		
		
		while(i <= 10) {
			j = i + j;
			i++;
		}
		System.out.println(j);
	}

}
