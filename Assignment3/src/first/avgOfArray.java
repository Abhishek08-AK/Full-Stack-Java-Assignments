 //Write a program to calculate average of elements in an array.

package first;
import java.util.Scanner;
public class avgOfArray {

	public static void main(String[] args) {
		int arr[]= new int[6];
		int i, sum=0;
		float avg;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 6 elements :");
		for(i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+ arr[i];
		}
		avg =sum/6;
		System.out.println("Average of elements of array is :"+avg);
     
	}

}
