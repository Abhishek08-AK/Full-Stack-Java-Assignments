//write a program to find out the highest element of an array.

package first;
import java.util.Scanner;
public class highestElement {
	    public static void main(String[] args) {
	    	int i;
	    	@SuppressWarnings("resource")
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter the 6 elements of array :");
	        int arr[] = new int [6]; 
	        
	        //Store the first element of array in max variable........... 
	        int max = arr[0];  
	       
	        for (i = 0; i < 6; i++) {   
	        	arr[i]=sc.nextInt();
	            if(arr[i] > max) 
	            {
	               max = arr[i];  
	            }
	        }  
	        System.out.println("Largest element of given array: " + max); 
	    }
	}  
