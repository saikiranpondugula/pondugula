package logical;

public class Pattern20 {
	public static void main(String[] args) {
		String res = "";
		int row,col,count = 1;
		for ( row = 1; row <= 4; row++) {
			for ( col = 1; col <= 4; col++) {
				if(row % 2 != 0) {
					if (col % 2 == 0) {
						res += "1 ";
					}
					else {
						res += "0 ";
					}
				}
				else {
					if (col % 2 == 0) {
						res += "0 ";
					}
					else {
						res += "1 ";
					}
				}
			}
			res +="\r";
		}
		System.out.println(res);

	}

}
