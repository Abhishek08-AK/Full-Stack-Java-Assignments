//Write a java program to find out the given number is palindrome or not.

package first;
import java.util.Scanner;
public class palindromeDemo {

	 public static void main(String args[])
	    {
	        int n;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number :");
	        n = sc.nextInt();
	        sc.close();
	        
	        int reverseNum = 0, remainder, temp=n ;
	        while(temp > 0)
	        {
	        	remainder = temp % 10;
	            reverseNum = reverseNum * 10 + remainder;
	            temp = temp / 10;
	        }
	        
	        if(n == reverseNum)
	        {
	            System.out.println(" "+n+" is a palindrome number");
	        }
	        else
	        {
	            System.out.println(" "+n+" is not a palindrome number");
	        }
	    }
	 
	}
