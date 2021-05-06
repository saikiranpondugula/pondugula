package logical;

import java.util.Scanner;

public class Amstrongnumberrange {

	static String res = "";
	static boolean isArmStrong(int num) {
		int count = 0, flag = num, rem = 0;
		while(flag != 0) {
			rem = flag % 10;
			count = count + 1;
			flag = flag / 10;
		}
		boolean b = false;
		int sum = 0, rem1 = 0, temp = num ;
		while (num != 0) {
			rem = num % 10;
			sum = (int) (sum + Math.pow(rem, count));
			num = num / 10 ;
		}
		if (sum == temp) {
			b = true;
		}
		
		return b;
	}
	
	static String checkArmStrongRange(int start_value , int end_value) {
		for (int i = start_value; i <= end_value; i++) {
			if(isArmStrong(i) == true) {
				res += i +",";
			}			
		}		
		return res.substring(0, res.length()-1);		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number ");
		System.out.println(checkArmStrongRange(sc.nextInt(), sc.nextInt()));
	}

}
