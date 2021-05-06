package logical;

public class Pattern5 {
	public static void main(String[] args) {
		String res = "";
		int row;
		for ( row = 5; row >= 1; row--) {
			for (int col = 5; col >= 1; col--) {
				res +=row+" ";
			}
			res +=" \r";
		}
		System.out.println(res);

	}

}
