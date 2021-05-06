package logical;

public class Pattern12 {
	public static void main(String[] args) {
		String res = "";
		int row;
		for ( row = 5; row >= 1; row--) {
			for (int col = 5; col >= row; col--) {
				res += "*"+" ";
			}
			res +=" \r";
		}
		System.out.println(res);

	}

}
