package strings;

import java.util.Scanner;

public class CountTheWordEndWithYOrZ {
	public static int countYZ(String input) {
		int count = 0;
		String[] arr = input.toLowerCase().split(" ");
		for (int i = 0; i < arr.length; i++) {
			String input2 = arr[i];
			if ((input2.charAt(input2.length() - 1) == 'y') || (input2.charAt(input2.length() - 1) == 'z')) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string.....");
		System.out.println("the number of words ending in y or z in a given string is :" + countYZ(sc.nextLine()));

	}
}
