//Write a program to calculate area and perimeter of rectangle and display the results.
// Using Functions..

package first;

public class rectangle {
	float area,  perimeter;
	void areaOfRectangle(float l, float b)
{
	area= l * b ;
	System.out.println("Area of rectangle="+area);
		
}

	void circumOfRectangle(float l, float b)
{
	perimeter= 2 * (l + b) ;
	System.out.println("Area of rectangle="+perimeter);
		
}
	
public static void main(String[] args)
{
	rectangle obj= new rectangle();
	obj.areaOfRectangle(10, 5);
	obj.circumOfRectangle(10,8);
}
}


// Without Functions..............
//package first;
//import java.util.Scanner;
//
//public class rectangle {	
//	
//public static void main(String[] args)
//{
//	float l, b, area, perimeter;
//	Scanner sc =new Scanner(System.in);
//	System.out.println("Enter length of rectangle (l) =");
//	l=sc.nextInt();
//	System.out.println("Enter breadth of rectangle (b) =");
//	b=sc.nextInt();
//	area= l * b ;
//	System.out.println("Area of rectangle="+area);
//	perimeter= 2 * (l + b) ;
//	System.out.println("Area of rectangle="+perimeter);
//	sc.close();	
//}
//}
