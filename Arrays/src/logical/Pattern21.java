package logical;

public class Pattern21 {
	public static void main(String[] args) {
		String res = "";
		int row,col;
		for ( row = 1; row <= 4; row++) {
			for ( col = 1; col <= 4; col++) {
				if(row == 1 || col == 1 || row == 4 || col == 4) {
				    res += "1";
				}
				else {
					res += " ";
				}
			}
			res +="\r";
		}
		System.out.println(res);

	}
}
