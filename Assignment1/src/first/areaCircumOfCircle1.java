//Write a program to calculate area and circumference of circle and display the results.

// Area of circle with using argument (parameter)...........

//package first;
//
//public class areaCircumOfCircle1 {	
//	void areaOfCircle(int r)
//	{
//	  double area= Math.PI * r * r;
//	  System.out.println("Area of circle  ="+area ); 
//	}
//	void circumOfCircle(int r)
//	{
//		  double Circumference= 2 * Math.PI * r;
//		  System.out.println("Circumference of circle  ="+Circumference);
//	}
//	
//public static void main(String[] args) {
//	areaCircumOfCircle1 obj= new areaCircumOfCircle1();
//	obj.areaOfCircle(4);
//	obj.circumOfCircle(6);
//}
//}

// Area of circle without using argument (parameter)...........
package first;

public class areaCircumOfCircle1 {	
	void areaOfCircle()
	{
	  int r=4;
	  double area= Math.PI * r * r;
	  System.out.println("Area of circle  ="+area ); 
	}
		
		void circumOfCircle()
		{
			  int r=6;
			  double Circumference= 2 * Math.PI * r;
			  System.out.println("Circumference of circle  ="+Circumference);
		}
	
public static void main(String[] args) {
	areaCircumOfCircle1 obj= new areaCircumOfCircle1();
	obj.areaOfCircle();
	obj.circumOfCircle();
}
}
