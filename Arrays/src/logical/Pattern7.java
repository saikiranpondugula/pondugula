package logical;

public class Pattern7 {
	public static void main(String[] args) {
		String res = "";
		int row;
		int count = 1;
		for ( row = 5; row >= 1; row--) {
			for (int col = 5; col >= row; col--) {
				res +=count+++" ";
			}
			res +=" \r";
		}
		System.out.println(res);

	}
}