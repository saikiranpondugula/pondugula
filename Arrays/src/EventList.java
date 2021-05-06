import java.util.Scanner;

public class EventList 
{
	static int[] getEvenArray(int[] arr){
		Scanner sc = new Scanner(System.in);
		int length = arr.length;
		System.out.println("Enter the Elements to array");
		for (int index = 0; index < arr.length; index++) 
		{
			arr[index] = sc.nextInt();
		}
		 int[] newArray = new int[length] ;
	
		if (length != 10)
		{
			return null;
		}
		
		else {
			int indexCopy = 0 ;
			int count = 0 ;
			for (int index = 0; index < arr.length; index++)
			{
				if (arr[index] % 2 == 0) 
				{
					count += 1 ;
								
					newArray[indexCopy] = arr[index];					
				}
				
				indexCopy += 1;
			}
			
			if (count == 0) {
				System.out.println("No Even Numbers in Given Array");
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		EventList el = new EventList();
		System.out.println("Enter the Array Size ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] copyArray = getEvenArray(arr);
		
		 
		if (copyArray != null) {
			System.out.print("Even Numbers in Given Array : ");
			 for (int index = 0; index < copyArray.length; index++) {
					if(copyArray[index] != 0 ) {
						System.out.print(copyArray[index]+" , ");
					}
				}
		}
		else {
			System.out.println("Size of Array must be 10 : "+copyArray);	
		}
	}
}
