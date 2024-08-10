package first;
import java.util.Scanner;

public class switchCaseDemo {
public static void main(String[] args)
{
	int a=10, b= 8, sum, sub, mul, div, ch;
	Scanner sc= new Scanner(System.in);
	System.out.println("1. sum \n2. sub \n3. mul \n4. div");
	System.out.println("Enter your choice :");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:
	{
		sum=a + b;
		System.out.println("Addition is ="+sum);
		break;
	}
	case 2:
	{
		sub=a - b;
		System.out.println("Subtraction is ="+sub);
		break;
	}
	case 3:
	{
		mul=a * b;
		System.out.println("Multiplication is ="+mul);
		break;
	}
	case 4:
	{
		div=a / b;
		System.out.println("Division is ="+div);
		break;
	}
	default:
	{
		System.out.println("Choice is wrong.........try again");	
	}
	sc.close();
	}
}
}
