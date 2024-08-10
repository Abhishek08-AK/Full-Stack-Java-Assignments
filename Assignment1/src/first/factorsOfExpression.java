//You are provided with an equation given below. 6x^2-18x-3 =0........Findout the factors for given expression.

package first;

public class factorsOfExpression {

	    public static void main(String[] args) {
	        double a = 6, b = -18, c = -3;

	        double discriminant = b * b - 4 * a * c;
	        
	        if (discriminant > 0) {

	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            
	            System.out.println("The roots of the equation are: " + root1 + " and " + root2);
	           
	        } else if (discriminant == 0) {
	            // One real root (repeated root)
	            double root = -b / (2 * a);
	             
	            System.out.println("The root of the equation is: " + root);
	            
	        } else {
	            // Complex roots.......
	            System.out.println("The equation has complex roots.");
	        }
	    }
	}

