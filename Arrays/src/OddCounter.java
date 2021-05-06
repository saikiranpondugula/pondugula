import java.util.Scanner;

public class OddCounter 
{
	static int getOddCount(int[] array) {
		int count = 0 ;
		int size = array.length;
		if(size != 10) {
			// System.out.println("Size of Array must be 10");
			return count = -1;
		}
		else {
			for (int index = 0; index < array.length; index++) {
				if(array[index] % 2 != 0) {
					count++;
				}
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Insert Elements to an Array : ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt(); 
		}
		System.out.println("Count of Odd numbers in Given Array : "+getOddCount(arr));

	}

}
