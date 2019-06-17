import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	final int targetSales = 1000;
	int mySales;
	int bonus;
	int total;
	String result;
	Scanner input = new Scanner(System.in);
	
	System.out.println("실적을 입력하세요(단위:만원):");
	mySales = input.nextInt();
	if(mySales >= targetSales){
		bonus = (mySales - targetSales)/10;	
		result = "실적 달성";
	}
	else { 
			bonus = 0;
			result ="실적을 달성하지 못했음";
		}
	
	System.out.println(result + "\n"+"보너스:" +bonus);
	}


}