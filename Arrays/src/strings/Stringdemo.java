package strings;

import java.util.Scanner;

public class Stringdemo {
     static int diff21(int number,int number1) {
    	 number1 = number-number1;
 		return number1;
     }

 public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the absolute differences betweemn the numbers");
	int number1 = sc.nextInt();
	System.out.println(diff21(21,number1));
}
}
