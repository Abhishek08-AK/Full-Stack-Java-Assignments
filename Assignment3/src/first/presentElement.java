// Write a program to find out whether the given element is present in the array or not....
	package first;
	import java.util.Scanner;
	public class presentElement {
		    public static void main(String[] args) {
		    	int i;
		    	int arr[] = new int [6]; 
		    	@SuppressWarnings("resource")
		    	Scanner sc= new Scanner(System.in);
		    	System.out.print("Enter the 6 elements of array :");
		        for(i=0;i<6;i++)
		        {
		        	arr[i]=sc.nextInt();
		        }
		        
		        System.out.println("Array elements are :");
		        for(i=0;i<6;i++)
		        {
		        	System.out.print(arr[i]+" ");
		        }
		        
		        System.out.println("\nEnter any number :");
		        int mychoice=sc.nextInt();
		        
		        boolean isPresent=false;
		        for(i=0;i<6;i++)
		        {
		            if(mychoice==arr[i])
		            {
		            	isPresent=true;
		            	break;
		            }
		            
		        }
		        
		        if(isPresent) 
	            {
	            	System.out.println("Number "+mychoice+ " is present in the given array."); 
	            }
	            else
	            {
	            	System.out.println("Number "+ mychoice+ " is not present in the given array."); 
	            }  
		       
	}
		    
}  

 