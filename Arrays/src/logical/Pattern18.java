package logical;

public class Pattern18 {
	public static void main(String[] args) {
		String res = "";
		int row,col;
		for ( row = 1; row <= 4; row++) {
			int count = 0 ;
			for ( col = 1 ; col <= 4; col++) {
				if(row == 1 || row ==  3) {
					res += "1 ";
				}
				else {
					res += "0 ";
				}	   
				    
			}			
			res +="\r";
		}	
		System.out.println(res);
	}
}
