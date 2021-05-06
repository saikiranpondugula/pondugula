package logical;

public class Pattern15 {
	public static void main(String[] args) {
		String res = "";
		int row,col;
		for ( row = 1; row <= 5; row++) {
			for ( col = 1; col <= 5; col++) {
				if(row == 1 || col == 1 || row == 5 || col == 5) {
				    res += "* ";
				}
				else {
					res += "  ";
				}
			}
			res +="\r";
		}
		System.out.println(res);

	}
}
