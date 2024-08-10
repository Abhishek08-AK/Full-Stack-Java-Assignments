// Write a program to calculate sum of all elements in an array.

package first;
import java.util.Scanner;
public class sumOfArray {

	public static void main(String[] args) {
		int arr[]= new int[6];
		int i, sum=0;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 6 elements :");
		for(i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+ arr[i];
		}
		System.out.println("Sum of all elements of array is :"+sum);
	}

}
