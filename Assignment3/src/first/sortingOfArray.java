//WAP to perform sort operation on given array in java.

package first;
import java.util.Arrays;

public class sortingOfArray {
	    public static void main(String[] args) {
	       
	        int array[]= {5, 3, 8, 1, 2, 7, 4, 6};
	        System.out.println("Original Array: " + Arrays.toString(array));

	        // Sort the array
	        Arrays.sort(array);

	        // Print the sorted array
	        System.out.println("Sorted Array: " + Arrays.toString(array));
	    }
	}

