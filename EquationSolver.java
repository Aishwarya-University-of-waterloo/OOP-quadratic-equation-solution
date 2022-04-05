/**
    * @author Interview3517 (Aishwarya_Wagh)
    * @category class
    * {@summary  
    * This class solves the standard quadratic equation,
    * It provides solution if input is valid
    * otherwise an appropriate error message is provided}
    */

public class EquationSolver {

	private EquationSolution equationSolution;

	public EquationSolver() {}
	public EquationSolver(EquationSolution equationSolution) {
		this.equationSolution = equationSolution; 
	}
	public EquationCoefficients parseInput(String[] args) {

		if(args.length!=3) {
			System.out.println("Please enter 3 values");
			return new EquationCoefficients();
		}
		try {
			double a=equationSolution.isEnteredValues(args[0]);

			if (a==0.0) {
				System.out.println("Value of a cannot be 0, please try again");
				return new EquationCoefficients();
			}
			double b=equationSolution.isEnteredValues(args[1]);
			double c=equationSolution.isEnteredValues(args[2]);


			EquationCoefficients equationObject = new EquationCoefficients(a, b, c);
			return equationObject;
		}catch(NumberFormatException ex){
			System.out.println("Please enter valid number without space or character");
		}
		return new EquationCoefficients();
	}

	public static void main(String[] args) {
		EquationSolution equationSolution = new EquationSolution();
		EquationSolver equationSolver = new EquationSolver(equationSolution);
		EquationCoefficients equationObject = new EquationCoefficients();
		equationObject=	equationSolver.parseInput(args);

		if(equationObject.isValid()) {
			double discriminant= equationObject.calculateDiscriminant();
			double a= equationObject.getA();
			double b= equationObject.getB();

			if(discriminant<0) {
				equationSolution.isImaginarySolution(discriminant,a,b);
			}else if(discriminant>0) {
				double solution1 = (-b - Math.sqrt(discriminant))/(2 *a);
				double solution2 = (-b + Math.sqrt(discriminant))/(2 *a);
				equationSolution.isTwoSolutions(solution1, solution2);
			}else {
				double solution1 =-b/(2 *a);
				equationSolution.isOneSolution(solution1);
			}
		}else {
			System.out.println("Invalid input received.");
		}




	}

}
