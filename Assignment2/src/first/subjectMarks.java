package first;
import java.util.Scanner;

public class subjectMarks {

	public static void main(String[] args) {
		int chem, phy, maths, mech, pce ,bee;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of chem out of 100 :");
        chem = sc.nextInt();
        System.out.println("Enter the marks of phy out of 100 :");
        phy = sc.nextInt();
        System.out.println("Enter the marks of maths out of 100 :");
        maths = sc.nextInt();
        System.out.println("Enter the marks of mech out of 100 :");
        mech = sc.nextInt();
        System.out.println("Enter the marks of pce out of 100 :");
        pce = sc.nextInt();
        System.out.println("Enter the marks of bee out of 100 :");
        bee = sc.nextInt();
        sc.close();
        
        int obtainedMarks, percentage, totalMarks=600;
        obtainedMarks = chem + phy + maths + mech + pce + bee;
        System.out.println("Total obtained marks of all subjects are :"+obtainedMarks);
        
        percentage=(obtainedMarks*100)/totalMarks;
        System.out.println("Percentage achieved by student is  :"+percentage+ "%");
        
        if(chem>=40 && phy>=40 && maths>=40 && mech>=40 && pce>=40 && bee>=40 )
        {
        	System.out.println("Student is passed");
        }
        else
        {
        	System.out.println("Student is fail");
        }

        //To check the failed subject and their names......
        String subjects[ ] = {"chem", "phy", "maths", "mech", "pce", "bee"};
        int marks[ ] = {chem, phy, maths, mech, pce, bee};
        int passMark = 40, failedCount = 0;
        
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < passMark) {
                System.out.println(subjects[i]);
                failedCount++;
            }  
        }
        System.out.println("Failed subjects:"+failedCount);
        
        // Determine if student is passed or failed.......
        if (failedCount == 0) {
            System.out.println("Student has passed all subjects.");
        } else {
            System.out.println("Student has failed in " + failedCount + " subject(s).");
            
            // Apply KT rule for the semester..........
            if (failedCount > 3) {
                System.out.println("Student has KT because they failed in more than 3 subjects.");
            }
        }
    }
}





