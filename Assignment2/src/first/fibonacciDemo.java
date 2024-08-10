//WAP to findout the fibonacci series upto nth term.

package first;
import java.util.Scanner;
public class fibonacciDemo {
		public static void main(String args[])  
		{
			int n, i, firstNum=0, secondNum=1, nextNum;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the value of n :");
			n=sc.nextInt();
			sc.close();
			for(i=1;i<=n;i++)
			{
				System.out.print(firstNum + ", ");
				nextNum= firstNum + secondNum ;
				firstNum = secondNum;
				secondNum = nextNum ;
			}
			
		}
	
	}  





