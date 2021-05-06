package logical;

import java.util.Scanner;

public class Palindromerange {
	static String res = "";
	static boolean isPalindrom(int num) {
		boolean b = false;
		int sum = 0, rem = 0, temp = num ;
		while (num != 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10 ;
		}
		if (sum == temp) {
			b = true;
		}
		
		return b;
	}
	
	static String checkPalindromRange(int start_value , int end_value) {
		for (int i = start_value; i <= end_value; i++) {
			if(isPalindrom(i) == true) {
				res += i +",";
			}			
		}		
		return res.substring(0, res.length()-1);		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number ");
		System.out.println(checkPalindromRange(sc.nextInt(), sc.nextInt()));
}
}
