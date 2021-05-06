package strings1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean checkAnagram(String s1, String s2) {
		boolean b = false;
		if (s1.length() != s2.length()) {
			b = false;
		} 
		else {
			char[] array1 = s1.toCharArray();
			char[] array2 = s2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if (Arrays.equals(array1, array2)) {
				b = true;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two Strings.....");
		if (checkAnagram(sc.next(), sc.next())) {
			System.out.println("two strings are anagram........");
		}
		else {
			System.out.println("two strings are not anagram........");
		}
	}
}