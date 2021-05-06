import java.util.Scanner;

public class Arraysum 
{
	static int getSum(int[] inputArray) 
	{
		int sum = 0;
		if(inputArray != null ) {
			for (int index = 0; index < inputArray.length; index++) {
				sum += inputArray[index];
			}
		}
		else {
			return sum = -1;
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size  Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Insert Elements in  Array : ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt(); 
		}
		System.out.println("Sum of Given Array : "+getSum(arr));

	}

}
