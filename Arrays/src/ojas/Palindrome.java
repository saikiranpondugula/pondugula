package ojas;

public class Palindrome {
	public static void main(String[] args) {
		String res = "";
		if(args.length != 1) {
			res += "Invalid Arguements\r";
			res += "Enter one number only";
			System.out.println(res);
			return;
		}
		int number = Integer.parseInt(args[0]);
		int rem, sum = 0, temp = number; 
		boolean b = false;
		if (number > 0) {			
		    while (number != 0) {
			     rem = number % 10;
			     sum *= 10 + rem;
			     number = number / 10;		
		    }
		    if (sum == temp) {
		    	res = "Is the Given  Num Is Palindrom : "+true ;
		    }
		    else {
		    	res = "Is the Given  Num Is Palindrom : "+b+ " ";
		    }
		} 
		else {
			res = "ERROR";
		}
		System.out.println(res);
	}
}
