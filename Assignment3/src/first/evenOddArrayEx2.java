//WAP to initialize the values of an array.Check each element is even or odd.Display the sum of only odd numbers from that array.
//(use type inheritance and constructor).

package first;

public class evenOddArrayEx2 extends evenOddArrayEx1 {
    public evenOddArrayEx2(int array[]) {
		super(array);
	}

	public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        evenOddArrayEx1 obj = new evenOddArrayEx1(arr);
        obj.checkEvenOdd();

        int sumOfOddNumbers = obj.sumOddNumbers();
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
    }

}
