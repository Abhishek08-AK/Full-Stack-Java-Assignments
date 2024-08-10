//Write a program to calculate basic arithmetic operations and display their results.

// Using Function chaining......
package first;

public class arithOperations {
	
void sum(int a, int b)
	 {
	 	int s=a+b;
	 	System.out.println( "Addition of a + b = "+s);
	 }

void sub(int m, int n)
{
	sum(10,5);
	int t= m - n;
	System.out.println("Subtraction of m - n = "+t);
}

void mul(int c, int d)
{
	sub(10,5);
	int f= c * d;
	System.out.println("Multiplication of c * d = "+f);
}

void div(int p, int q)
{
	mul(10,5);
	int r= p / q;
	System.out.println("Division of p / q = "+r);
}

void modulo(int x, int y)
{
	div(10,5);
	int z= x % y;
	System.out.println("Modulo of x % y = "+z);
}
	

public static void main(String[] args)
{
	arithOperations obj = new arithOperations();
	
	obj.modulo(10,3);
}
	
}
