package logical;

import java.util.Scanner;

public class Russianmultiplication {
	public static void main(String[] args) {
		System.out.println("Enter Two Numbers");
		Scanner sc = new Scanner(System.in);
		int first_num = sc.nextInt();
		int second_num = sc.nextInt();
		int sum = 0;
		String res = first_num+" : "+second_num+"\r";
		while(first_num != 0) {
			if(first_num % 2 != 0) {
				sum += second_num;
			}
			first_num = first_num / 2 ;
			second_num = second_num * 2 ;
			res += first_num+" : "+second_num+"\r";
		}
		System.out.println(res);
		System.out.println(sum);
	}
}
