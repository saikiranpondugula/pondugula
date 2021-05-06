package logical;

public class Pattern24 {
	public static void main(String[] args) {
		String res = "";
		int row,col;
		for ( row = 1; row <= 5; row++) {
			for ( col = row; col <= 5; col++) {
				res += " ";
			}
			for (int star = 1; star <= row; star++) {
				res += "1 ";
			}
			res +="\r";
		}
		System.out.println(res);

	}

}
