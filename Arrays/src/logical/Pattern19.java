package logical;

public class Pattern19 {
	public static void main(String[] args) {
		String res = "";
		int row,col, count = 16;
		for ( row = 1; row <= 4; row++) {
			for ( col = 1 ; col <= 4; col++) {	   
				    res += count-- +" ";
			}			
			res +="\r";
		}	
		System.out.println(res);

	}
}
