import java.util.*;
public class Person {
	
	
	
	public static void main(String[] args) {
	
	double x1;
	double x2;
	double y1;
	double y2;
	
	Scanner input = new Scanner(System.in);
	System.out.println("������ ���̸� �Է��Ͻÿ�");
	x1 = input.nextDouble();
	System.out.println("������ ���̸� �Է��ϼ���");
	x2 = input.nextDouble();
	
	y1 = x1 * x2;
	y2 = (x1 + x2)*2;
	
	System.out.printf("%s %.2f" ,"���簢���� ���̴�",y1);
	System.out.println("\n");
	System.out.printf("%s %.2f" ,"���簢���� �ѷ���",y2);
	
	
	
	

}
}
