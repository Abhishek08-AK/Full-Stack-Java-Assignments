package first;
import java.util.Scanner;
public class subjectMarks1 {

	public static void main(String[] args) {
	int marks[]= new int[6];
	int i, total=0, failedCount=0;
	float percentage;
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 6 subjects marks out of 100 :");
	
	for(i=0;i<6;i++)
	{
		marks[i]= sc.nextInt();
		total=total+marks[i];
	}
	
		System.out.println("Total Marks :"+total);
		percentage= (float) (total * 100)/600;
		System.out.println("Percentages :"+percentage);
		
		for(i=0;i<6;i++)
		{
			if(marks[i]<40)
			{
				failedCount++;
			}
		}
		System.out.println("FailedCount :"+failedCount);
		
		if(failedCount>3)
		{
			System.out.println("Result : failed");	
		}
		else if(failedCount>0 && failedCount<=3)
		{
			System.out.println("Result : KT");
		}
		else
		{
			System.out.println("Result : Passed");	
		}
		
	}
	
}
