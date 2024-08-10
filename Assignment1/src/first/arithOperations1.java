//Write a program to calculate basic arithmetic operations and display their results.

//Using functions.....
package first;

public class arithOperations1 {
	
void sum(int a, int b)
	 {
	 	int s=a+b;
	 	System.out.println( "Addition of a + b = "+s);
	 }

void sub(int m, int n)
{
	int t= m - n;
	System.out.println("Subtraction of m - n = "+t);
}

void mul(int c, int d)
{
	int f= c * d;
	System.out.println("Multiplication of c * d = "+f);
}

void div(int p, int q)
{
	int r= p / q;
	System.out.println("Division of p / q = "+r);
}

void modulo(int x, int y)
{
	int z= x % y;
	System.out.println("Modulo of x % y = "+z);
}
	
public static void main(String[] args)
{
	arithOperations1 obj = new arithOperations1();
	obj.sum(10,5);
	obj.sub(10,8);
	obj.mul(10,2);
	obj.div(20,5);
	obj.modulo(10,3);
}
	
}


