import java.util.Scanner;

public class MaxNumber
{
	static int getMax(int[] inputArray) {
		int maxNumber = inputArray[0];
		int size = inputArray.length;
		if(inputArray != null) {
			if(size != 10) {
				return maxNumber = -1;
			}
			else {
			    for (int index = 1; index < inputArray.length; index++) {
				    if(maxNumber < inputArray[index]) {
					    maxNumber = inputArray[index] ;
			     	}
			    }
			}
		} else {
			return maxNumber = -1 ;
		}
		
		return maxNumber;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Array Size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Insert Elements to an Array : ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = Math.abs(sc.nextInt()); 
		}
		System.out.println("Maximum number in Given Array : "+getMax(arr));
	}


}
