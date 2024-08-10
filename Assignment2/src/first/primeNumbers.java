// WAP to display prime numbers between 1 to 100.
//package first;
//
//public class primeNumbers {
//public static void main(String[] args)
//   {		
//       int n, i;
//
//       for (i=2;i<=100; i++)  
//       {
//    	   boolean isPrime=true;
//    	   for (n = 2; n<i; n++)  
//           {
//    		   if(i%n==0)
//    		   {
//            	   isPrime=false;
//            	   break;
//    		   }
//           } 
//    	   
//    	   if(isPrime)
//    	   {
//    		   System.out.print(n + ", ");
//    	   }
//       }
//   }
//}

       

//WAP to display prime numbers between 1 to nth term.

package first;
import java.util.Scanner;
public class primeNumbers {
public static void main(String[] args)
   {		
       int n, i, min, max; 
       boolean isPrime=true;
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter min number :");
       min=sc.nextInt();
       System.out.println("Enter max number :");
       max=sc.nextInt();
       
       for (n=min;n<=max; n++)  
       {
    	   for (i = 2; i<n; i++)  
           {
    		   if(n%i==0)
    		   {
    			   isPrime=false;
            	   break;
    		   }
           } 
    	   if(isPrime)
    	   {
    		   System.out.print(n + " ");
    	   }
    	   isPrime=true;
       }
   }
}

