//WAP to initialize the values of an array.Check each element is even or odd.Display the sum of only odd numbers from that array.
//(use type inheritance and constructor).

package first;

public class evenOddArrayEx1 {
	    private int arr[];

	    public evenOddArrayEx1(int array[]) {
	        this.arr = array;
	    }

	    public void checkEvenOdd() {
	        for (int i : arr) {
	            if (i % 2 == 0) {
	                System.out.println(i + " is even.");
	            } else {
	                System.out.println(i + " is odd.");
	            }
	        }
	    }

	    public int sumOddNumbers() {
	        int sum = 0;
	        for (int i : arr) {
	            if (i % 2 != 0) {
	                sum=sum + i;
	            }
	        }
	        return sum;
	    }
	}


