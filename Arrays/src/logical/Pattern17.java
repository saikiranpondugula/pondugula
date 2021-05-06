package logical;

public class Pattern17 {
	public static void main(String[] args) {
		String res = "";
		int row,col;
		for ( row = 1; row <= 5; row++) {
			int count = 0 ;
			for ( col = 1 ; col <= row; col++) {
				
				    res += count++ +" ";
				    
			}
			res +="\r";
		}
		System.out.println(res);

	}
}
