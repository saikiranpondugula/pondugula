package ojas;

public class Factorsofnumber {
	public static void main(String[] args) {
		String res = "";
		if(args.length != 1) {
			res += "Invalid Arguements\r";
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
		 int i=1;
		   while (i <= number) {
			   if(number % i == 0) {
					res += i+ " "; 
				}
				i++;
		   }
		   res +="Factors of Given Number";
		} 
		else {
			res = "ERROR";
		}
		System.out.println(res);
	}
}
