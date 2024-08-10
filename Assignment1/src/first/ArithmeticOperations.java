//Write a program to calculate basic arithmetic operations and display their results.

package first;
import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args)
	{
		int a , b ,sum,sub, mul, div, modulo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a =");
		a =sc.nextInt();
		System.out.println("Enter value of b =");
		b =sc.nextInt();
		sum = a + b;
		System.out.println("Adition is ="+sum);
		sub= a - b;
		System.out.println("Subtraction is ="+sub);
		mul= a * b;
		System.out.println("Multiplication is ="+mul);
		div= a / b;
		System.out.println("Division is ="+div);
		modulo= a % b;
		System.out.println("Modulo is ="+modulo);
		sc.close();
	}
	}


