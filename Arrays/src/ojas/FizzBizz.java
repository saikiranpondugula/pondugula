package ojas;

import java.util.Scanner;

public class FizzBizz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		String res = " ";
		/*if(num % 3 == 0 ) {
			res = "Fizz";
		}
		if(num % 5 == 0) {
			res = "Bizz";
		}
		if(num % 3 == 0 && num % 5 == 0) {
			res = "FizzBizz";
		}*/
		if(num % 3 == 0 ) {
			res = "Fizz";
		}
		if(num % 5 == 0) {
				res = "Bizz";
			}
		else if(num % 3 == 0 && num % 5 == 0) {
					res = "FizzBizz";
				}
		else {
			 res = "INVALID NUMBER";
		}
		System.out.println(res);
	}
}