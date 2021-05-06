package logical;

public class Pattern23 {
	public static void main(String[] args) {
		String res = "";
		int row,col,count = 5;
		for ( row = 1; row <= 5; row++) {
			int flag = count;
			for ( col = 1; col <= 5; col++) {
				res += flag-- +" ";
			}
			count = count + 5;
			res +="\r";
		}
		System.out.println(res);

	}
}
