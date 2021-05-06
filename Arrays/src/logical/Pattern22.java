package logical;

public class Pattern22 {
	public static void main(String[] args) {
		String res = "";
		int row,col;
		for ( row = 1; row <= 5; row++) {
			for ( col = 1; col <= 5; col++) {
				if(col == 2 || col == 4 ) {
				    res += "* ";
				}
				else {
					res += "1 ";
				}
			}
			res +="\r";
		}
		System.out.println(res);

	}
}
