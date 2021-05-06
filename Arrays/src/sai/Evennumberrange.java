package sai;

import java.util.Scanner;

public class Evennumberrange 
{
	public static void main(String args[])
	{
		String res = "";
		Scanner sc = new Scanner(System.in);
		res +="enter the even number range";
		int i = Integer.parseInt(args[0]);
		for(int j=0;j<=i/2;j++)
		System.out.println(res);
	}

}
