package ojas;

import java.util.Scanner;

public class Naturalnumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting num,end num");
		String res = " ";
		int starting  = sc.nextInt();
		int end  = sc.nextInt();
		while(end  >= starting ) {
			System.out.print(starting +",");
			starting++;
			
		}
			
		}
		//System.out.println(res);
}

