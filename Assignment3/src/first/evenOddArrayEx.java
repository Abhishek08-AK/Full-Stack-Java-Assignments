//WAP to initialize the values of an array.Check each element is even or odd.Display the sum of only odd numbers from that array.

package first;
import java.util.Scanner;
public class evenOddArrayEx {
public static void main(String[] args) {
	int i;
	int arr[]= new int[5];
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the 5 elements :");
	for(i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Array elements are :");
	for(i=0;i<5;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	System.out.println("\n");
	
//Check each element is even or odd 
	int evenCount=0, oddCount=0,oddSum=0,evenIndex = 0, oddIndex = 0;
	int evenNumbers[] = new int[5];
    int oddNumbers[] = new int[5];
    
	for(i=0;i<5;i++)
	{
		if(arr[i]%2==0)
		{
			evenNumbers[evenIndex++] = arr[i];
			System.out.println("Number "+ arr[i]+" is even number");	
			evenCount++;
		}
		else
		{
			oddNumbers[oddIndex++] = arr[i];
			System.out.println("Number "+ arr[i]+" is odd number");
			oddSum=oddSum+arr[i];
			oddCount++;
		}
	}
	
	System.out.println("\n");
	System.out.println("Total even numbers are :"+evenCount);
	System.out.println("Total odd numbers are :"+oddCount);
	System.out.println("\n");
	
	System.out.println("Even numbers are :");
	for(i=0;i<5;i++)
	{
	System.out.println(evenNumbers[i]+" ");
	}
	
	System.out.println("Odd numbers are :");
	for(i=0;i<5;i++)
	{
		System.out.println(oddNumbers[i] + " ");
	}
	System.out.println("Sum of odd numbers is: " + oddSum);
}
}
