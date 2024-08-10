//Using Nested switch case............

package first;
import java.lang.Math;
import java.util.Scanner;

public class switchCaseDemo1 {

	public static void main(String[] args) {
		
			double r, area, perimeter ,circumference;
			int ch ;
			Scanner sc= new Scanner(System.in);
			System.out.println("You can select option.");
			System.out.println("1. Circle \n2. Rectangle");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{ 
				System.out.println("Enter radius :");
				r=sc.nextInt();
				System.out.println("What you want to calculate ?");
				System.out.println("1. Area \n2. Circumference");
				System.out.println("Enter your choice :");
				ch=sc.nextInt();
				switch(ch)
				{
				
				case 1:
				{	
					area= Math.PI * r * r;
					System.out.println("Area of circle is ="+area);
					break;
				}
				case 2:
				{
					circumference= 2 * Math.PI * r ;
					System.out.println("Circumference of circle is ="+circumference);
					break;
				}
				default:
				{
					System.out.println("Choice is wrong.........try again");	
				}
			}
				break;
		}
			case 2:
			{
				int l, b;
				System.out.println("Enter length :");
				l=sc.nextInt();
				System.out.println("Enter breadth :");
				b=sc.nextInt();
				System.out.println("What you want to calculate ?");
				System.out.println("1. Area \n2. Perimeter");
				System.out.println("Enter your choice :");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
				{	
					area= l * b;
					System.out.println("Area of rectangle is ="+area);
					break;
				}
				case 2:
				{
					perimeter= 2 * (l + b) ;
					System.out.println("Perimeter of rectangle is ="+perimeter);
					break;
				}
				default:
				{
					System.out.println("Choice is wrong.........try again");	
				}
			}
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
			
		
		




//package first;
//import java.lang.Math;
//import java.util.Scanner;
//
//public class switchCaseDemo1 {
//
//	public static void main(String[] args) {
//		
//			double r, l, b, area, perimeter,circumference;
//			int ch;
//			Scanner sc= new Scanner(System.in);
//			System.out.println("You can select option.");
//			System.out.println("1. Circle \n2. Rectangle");
//			System.out.println("Enter your choice :");
//			ch=sc.nextInt();
//			
//			switch(ch)
//			{
//			case 1:
//			{
//				System.out.println("Enter radius :");
//				r=sc.nextDouble();
//				area= Math.PI * r * r; 
//				System.out.println("Area of circle is ="+area);
//				circumference= 2 * Math.PI * r ;
//				System.out.println("circumference of circle is ="+circumference);
//				break;
//			}
//			case 2:
//			{
//				System.out.println("Enter length :");
//				l=r=sc.nextDouble();
//				System.out.println("Enter breadth :");
//				b=r=sc.nextDouble();
//				area= l * b;
//				System.out.println("Area of rectangle is ="+area);
//				perimeter= 2 * (l + b);
//				System.out.println("Perimeter of rectangle is ="+perimeter);
//				break;
//			}
//			default:
//			{
//				System.out.println("Choice is wrong.........try again");	
//			}
//			}
//			sc.close();
//		}
//	
//		}
