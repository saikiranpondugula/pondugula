package logical;

public class Pattern10 {
	public static void main(String[] args) {
		String res = "";
		int count = 65 ;
		for (int row = 1; row <= 5; row++) {
			
			for (int col = 1; col <= row; col++) {
				char ch = (char)count;
				res +=ch+" ";
				count++;
			}
			res +=" \r";
		}
		System.out.println(res);

	}

}
