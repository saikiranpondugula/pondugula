package logical;

public class Pattern25 {
	public static void main(String[] args) {
		String res = "";
		int count = 10;
		for (int row = 4; row >= 1; row--) {
			for (int col = row; col >= 1; col--) {
				res += count-- +" ";
			}
			res += "\r";
		}
		System.out.println(res);
	} 
}
