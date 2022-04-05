/**
    * @author Interview3517 (Aishwarya_Wagh)
    * @category class
    * {@summary  
    * This class accepts, process and output command line values}
    */

public class EquationSolution {

	

	public double isEnteredValues(String str) throws NumberFormatException{
		double value=Constants.MINIMUM;
		try {
			if (0<str.length()) {
				value= Double.parseDouble(str);
			}
		}catch(NumberFormatException ex) {
			throw new NumberFormatException();
		}
		return value;
	} 


	
	public  void isImaginarySolution(double discriminant,double a,double b) {
		double real = -b / (2 * a);
		double imaginary = Math.sqrt(-discriminant) / (2 * a);
		System.out.println("Equation has two imaginary solutions");
		System.out.format("\nSolution1 = %.2f+%.2fi", real, Math.abs(imaginary));
		System.out.format("\nSolution2 = %.2f-%.2fi", real, Math.abs(imaginary));
	}


	public  void isOneSolution(double solution1) {
		System.out.println("Equation has two equal solutions:");
		System.out.format("\nSolution 1 = Solution 2= %.2f ",solution1);
	}

	public  void isTwoSolutions(double solution1, double solution2) {
		System.out.println("Equation has two distinct and real solutions:");
		if(Math.abs(solution1)==0) {
			solution1=0.0;
		}if(Math.abs(solution2)==0) {
			solution2=0.0;
		}
		
		System.out.format("\nSolution 1  = %.2f",solution1);
		System.out.format("\nSolution 2  = %.2f",solution2);
	}


}
