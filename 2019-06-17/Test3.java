import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	final int targetSales = 1000;
	int mySales;
	int bonus;
	int total;
	String result;
	Scanner input = new Scanner(System.in);
	
	System.out.println("������ �Է��ϼ���(����:����):");
	mySales = input.nextInt();
	if(mySales >= targetSales){
		bonus = (mySales - targetSales)/10;	
		result = "���� �޼�";
	}
	else { 
			bonus = 0;
			result ="������ �޼����� ������";
		}
	
	System.out.println(result + "\n"+"���ʽ�:" +bonus);
	}


}