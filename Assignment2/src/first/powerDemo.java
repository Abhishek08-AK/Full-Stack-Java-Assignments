//Write a java program to findout the value of a^b.

package first;
import java.util.Scanner;
import java.lang.Math;
public class powerDemo {

	public static void main(String[] args) {
		double a, b , result;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of a: ");
         a = sc.nextInt();
        
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        
        result = Math.pow(a, b);
        System.out.println(a + " raised to the power of " + b + " is " + result);
        sc.close();
    }
}
