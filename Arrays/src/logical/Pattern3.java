package logical;

public class Pattern3 {
	public static void main(String[] args) {
		String res = "";
		int row;
		for ( row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				res +=row+" ";
			}
			res +=" \r";
		}
		System.out.println(res);
	}
}
