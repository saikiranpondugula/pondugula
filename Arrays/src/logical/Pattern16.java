package logical;

public class Pattern16 {
	public static void main(String[] args) {
		String res = "";
		int row,col, count = 2;
		for ( row = 1; row <= 5; row++) {
			for ( col = 1 ; col <= row; col++) {
				
				    res += count +"  ";
				    count = count + 2;
				    
			}
			res +="\r";
		}
		System.out.println(res);

	}
}
