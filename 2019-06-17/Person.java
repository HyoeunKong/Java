import java.util.*;
public class Person {
	
	
	
	public static void main(String[] args) {
	
	double x1;
	double x2;
	double y1;
	double y2;
	
	Scanner input = new Scanner(System.in);
	System.out.println("가로의 길이를 입력하시오");
	x1 = input.nextDouble();
	System.out.println("세로의 길이를 입력하세요");
	x2 = input.nextDouble();
	
	y1 = x1 * x2;
	y2 = (x1 + x2)*2;
	
	System.out.printf("%s %.2f" ,"직사각형의 넓이는",y1);
	System.out.println("\n");
	System.out.printf("%s %.2f" ,"직사각형의 둘레는",y2);
	
	
	
	

}
}
