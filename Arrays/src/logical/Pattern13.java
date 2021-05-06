package logical;

public class Pattern13 {
	public static void main(String[] args) {
		String res = "";
		int row,col;
		for ( row = 1; row <= 5; row++) {
			for ( col = row; col <= 5; col++) {
				res += " ";
			}
			for (int star = 1; star <= row; star++) {
				res += "*";
			}
			res +="\r";
		}
		System.out.println(res);

	}

}
