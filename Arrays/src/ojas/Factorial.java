package ojas;

public class Factorial {
	public static void main(String[] args) {
		String res = "";
		
		if(args.length != 1 ) {
			res += "Invalid Arguements\n";
			res += "Enter one number only";
			System.out.println(res);
			return;
		}
		int number = 0;
		
		try {
			number = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException ne) {
			res = "ERROR ";
		}	
		
		if (number > 0) {
		int fact = 1, i=1;
		   while (i <= number) {
			   fact = fact * i ;
			   i++; 
		   }
		res =fact+ " is Factorial of given Number";
		} 
		else {
			res = "ERROR";
		}
		System.out.println(res);
	}
}
