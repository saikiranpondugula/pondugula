package logical;

public class Pattern1 {

	public static void main(String[] args) {
		String res = "";
		int row;
		for ( row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				res +=col+" ";
			}
			res +=" \r";
		}
		System.out.println(res);

	}

}
