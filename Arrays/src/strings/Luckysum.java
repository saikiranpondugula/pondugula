package strings;

import java.util.Scanner;

public class Luckysum {
	static   int  luckySum(int number1, int number2, int count) {
		if(count == 13 ) {
			return number1 =number2+number1;
		}
		else if(number1 == 13  ) {
			return number1 = 0;
		}
		else if(number2 == 13) {
			return number2 = number1;
		}
		else if(!(count ==13 )) {
			return count = count+number1+number2;
		}
		return 0;	
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for differences");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int count = sc.nextInt();
		System.out.println(luckySum(number1, number2, count));
	}
}
