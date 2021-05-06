package strings;

import java.util.Scanner;

public class Saikiranreddy {
	static int noTeenSum(int count,int number1,int number2) {
		count = count+number1+number2;
		if((count == 15 || count == 16){ {
			System.out.println("saikiran");
		}
			return count;
		}
		else if(number1 == 13) {
			return number1 = 0;
		}
		else if(number2 == 13) {
			return number2 = number1;
		}
		else if(!(count == 13 )) {
			return count = count+number1+number2;
		}
	}	
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enrtert the calues");
	int count = sc.nextInt();
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	System.out.println(noTeenSum(count,number1,number2));
}
}