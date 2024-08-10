//Write a program to perform value interchange between two variables(swapping of two numbers) 1)you may use third variable  2) without using third variable.

//Swapping using temporary variable....

//package first;
//import java.util.Scanner;
//public class swappingOfTwoVariables {
//public static void main(String[] args)
//{
//int a , b, temp ;
//Scanner sc= new Scanner(System.in);
//System.out.println("Enter value of a =");
//a=sc.nextInt();
//System.out.println("Enter value of b =");
//b=sc.nextInt();
//System.out.println("Value of a before swapping="+a);
//System.out.println("Value of b before swapping="+b);
//
//temp=a;
//a=b;
//b=temp;
//System.out.println("Value of a after swapping="+a);
//System.out.println("Value of b after swapping="+b);
//sc.close();
//}
//}
 


//Swapping without using temporary variable....(using addition and subtraction).....
package first;
import java.util.Scanner;
public class swappingOfTwoVariables {
public static void main(String[] args)
{
int a , b;
Scanner sc= new Scanner(System.in);
System.out.println("Enter value of a =");
a=sc.nextInt();
System.out.println("Enter value of b =");
b=sc.nextInt();
System.out.println("Value of a before swapping="+a);
System.out.println("Value of b before swapping="+b);

a = a + b;
b = a - b;
a = a - b;
System.out.println("Value of a after swapping="+a);
System.out.println("Value of b after swapping="+b);
sc.close();
}
}


//Swapping without using temporary variable....(using multiplication and division).....
//package first;
//import java.util.Scanner;
//public class swappingOfTwoVariables {
//public static void main(String[] args)
//{
//int a , b;
//Scanner sc= new Scanner(System.in);
//System.out.println("Enter value of a =");
//a=sc.nextInt();
//System.out.println("Enter value of b =");
//b=sc.nextInt();
//System.out.println("Value of a before swapping="+a);
//System.out.println("Value of b before swapping="+b);
//
//a = a * b;
//b = a / b;
//a = a / b;
//System.out.println("Value of a after swapping="+a);
//System.out.println("Value of b after swapping="+b);
//sc.close();
//}
//}

