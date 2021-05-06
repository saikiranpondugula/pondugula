import java.util.Scanner;

public class OccurenceCounter 
{
	static int getCount(int[] array, int number) {
		int count = 0;		
		for (int index = 0; index < array.length; index++) {
			
			if(Math.abs(array[index]) == number) {
				count ++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter The Number to Find Occurence in Array");
		int number = sc.nextInt();
		System.out.println("Insert Elements to an Array");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		System.out.println(number+" Occured in an Given array in : "+getCount(arr, number)+" times ");

	}

}
