package logical;

public class Pattern4 {
	public static void main(String[] args) {
		String res = "";
		int row;
		for ( row = 1; row <= 5; row++) {
			for (int col = 5; col >= 1; col--) {
				res +=col+" ";
			}
			res +=" \r";
		}
		System.out.println(res);
	}
}
