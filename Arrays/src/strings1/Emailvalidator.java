package strings1;

import java.util.Scanner;

public class Emailvalidator {

	static String isValidEmail(String str) {
		String s = "";
		int count = 0;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == '@') {
				count++;
			}
		}
		if(str.charAt(0) >= 97 && str.charAt(0) <= 122) {
			if(str.contains("@")) {
				if(count == 1) {
					if(str.endsWith(".com") || str.endsWith(".co.in")) {
						if(str.contains("[a-zA-Z0-9]") || str.contains("_") || str.contains(".") || str.contains("@")) {
							s = "valid";
						}
						else {
							s = "-5";
						}
						
					}
					else {
						s = "-4";
					}
				}
				else {
					s = "-3";
				}
			}
			else {
				s = "-2";
			}
		}
		else {
			s = "-1";
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the email id");
		String str = scan.next();
		System.out.println(isValidEmail(str));
	}
}
