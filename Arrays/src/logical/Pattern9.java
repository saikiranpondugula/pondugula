package logical;

public class Pattern9 {
	public static void main(String[] args) {
		String res = "";
		int row;
		
		for ( row = 1; row <= 5; row++) {

			for (int col = row; col <= 5; col++) {
				res += row+" ";
			}
			res +=" \r";
		}
		System.out.println(res);

	}

}
