import java.util.Scanner;

public class Countevens 
{
	static int getEvenCount(int[] array) {
		Scanner sc = new Scanner(System.in);
		int[] newArray = new int[array.length];
		int count = 0 ;
		System.out.println("Insert Elements in Array : ");
		for (int index = 0; index < newArray.length; index++) {
			newArray[index] = sc.nextInt(); 
		}
		
		if(newArray == null) {
			 count = -1;
		}
		else {
			for (int index = 0; index < array.length; index++) {
				if(newArray[index] % 2 == 0 || newArray[index] == 0) {
					count += 1;
				}
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Array Size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Count of Even numbers in Given Array : "+getEvenCount(arr));

	}


}
