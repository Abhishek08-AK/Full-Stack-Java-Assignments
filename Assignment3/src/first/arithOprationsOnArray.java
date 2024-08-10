 //Write a program to calculate sum,sub,div of two matrices.
	package first;
	import java.util.Scanner;
	public class arithOprationsOnArray {

		public static void main(String[] args) {
			int row, col;
			
			int arr[][]= new int[3][3];
			int arr1[][]= new int[3][3];
			int calc[][]=new int[3][3];
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter 9 elements 1st matrices :");
		
			for(row=0;row<3;row++)
			{
				for(col=0;col<3;col++)
				{
					arr[row][col]=sc.nextInt();	
				}
			}
							
			System.out.print("Enter 9 elements 2nd matrices :");
			for(row=0;row<3;row++)
			{
				for(col=0;col<3;col++)
				{
					arr1[row][col]=sc.nextInt();	
				}
			}
					
			System.out.println("First Matrix :");
			for(row=0;row<3;row++)
			{
				for(col=0;col<3;col++)
				{
					System.out.print(" "+arr[row][col]);
				}
				System.out.println();
			}
			
			System.out.println("Second Matrix :");
			
			for(row=0;row<3;row++)
			{
				for(col=0;col<3;col++)
				{
					System.out.print(" "+arr1[row][col]);
				}
				System.out.println();
			}
			
			System.out.println("Addition of matrices:");   
			for(row=0;row<3;row++)
			{    
				for(col=0;col<3;col++)
					{    
					calc[row][col]=arr[row][col]+arr1[row][col];    //use - for subtraction  
					System.out.print(calc[row][col]+" ");    
					}    
				System.out.println();//new line    
			}    
			
			System.out.println("Subtraction of matrices:");
			for(row=0;row<3;row++)
			{    
				for(col=0;col<3;col++)
					{    
					calc[row][col]=arr[row][col]-arr1[row][col];    //use - for subtraction  
					System.out.print(calc[row][col]+" ");    
					}    
				System.out.println();//new line    
			}   
			System.out.println("Division of matrices:");
			for(row=0;row<3;row++)
			{    
				for(col=0;col<3;col++)
					{    
					calc[row][col]=arr[row][col]/arr1[row][col];    //use - for subtraction  
					System.out.print(calc[row][col]+" ");    
					}    
				System.out.println();//new line    
			}
	}	
}
	

//package first;
//public class arithOprationsOnArray{  
//	public static void main(String args[]){  
//		int row,col;   
//		int a[][]={{2,3,4},{2,4,3},{3,4,5}};    
//		int b[][]={{4,3,5},{6,1,8},{1,2,4}};    
//		    
//		//creating another matrix to store the sum of two matrices    
//		int c[][]=new int[3][3];  
//		 
//		System.out.println("Addition of matrices:");   
//		for(row=0;row<3;row++)
//		{    
//			for(col=0;col<3;col++)
//				{    
//				c[row][col]=a[row][col]+b[row][col];  
//				System.out.print(c[row][col]+" ");    
//				}    
//			System.out.println();   
//		}    
//		
//		System.out.println("Subtraction of matrices:");
//		for(row=0;row<3;row++)
//		{    
//			for(col=0;col<3;col++)
//				{    
//				c[row][col]=a[row][col]-b[row][col];  
//				System.out.print(c[row][col]+" ");    
//				}    
//			System.out.println();   
//		} 
//		System.out.println("Division of matrices:");
//		for(row=0;row<3;row++)
//		{    
//			for(col=0;col<3;col++)
//				{    
//				c[row][col]=a[row][col]/b[row][col];  
//				System.out.print(c[row][col]+" ");    
//				}    
//			System.out.println();    
//		}   
//	}
//} 
