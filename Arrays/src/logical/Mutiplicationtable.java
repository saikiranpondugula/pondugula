package logical;

import java.util.Scanner;

public class Mutiplicationtable {
public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int start_value = sc.nextInt();
		int end_value = sc.nextInt();
		String res = "";
		
		for (int j = start_value; j <= end_value; j++) {
			for (int i = 1; i <= 10; i++) {
				res += j+" * "+i+" = "+(j * i)+" \r"; 
			}
			res += "-----------------------------------------\r";
		}	
		System.out.println(res);
	}
}
