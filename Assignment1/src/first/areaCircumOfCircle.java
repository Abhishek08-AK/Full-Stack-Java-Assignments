//Write a program to calculate area and circumference of circle and display the results.

package first;
import java.util.Scanner;

public class areaCircumOfCircle {
public static void main(String[] args)
{
	int r;
	double  area, circumference;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle =");
	r = sc.nextInt();
	area= Math.PI * r * r;
	System.out.println("Area of of circle ="+area);
	circumference= 2 * Math.PI * r;
	System.out.println("Circumference of circle ="+circumference);
	sc.close();
}
}
