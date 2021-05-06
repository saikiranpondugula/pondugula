import java.util.Scanner;

public class MinNumber 
{
	static int getMin(int[] inputArray) 
	{
		int minNumber = inputArray[0];
		int size = inputArray.length;
		if(inputArray != null) 
		{
			if(size != 10) 
			{
				 minNumber = -1;
			}
			else 
			{
			    for (int index = 1; index < inputArray.length; index++) 
			    {
				    if(minNumber > inputArray[index]) 
				    {
					    minNumber = inputArray[index] ;
			     	}
			    }
			}
		} 
		else 
		{
			 minNumber = -1 ;
		}
		
		return minNumber;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Insert Elements to an Array : ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = Math.abs(sc.nextInt()); 
		}
		System.out.println("Maximum number in Given Array : "+getMin(arr));

	}


}
