 /**
    * @author Interview3517 (Aishwarya_Wagh)
    * @category class
    * 
    * {@summary  This class holds values for quadratic equation coefficients}
    */
public class EquationCoefficients {
	private double a;
	private double b;
	private double c;
	private boolean isValid;
	public EquationCoefficients() {
		this.a=Constants.MINIMUM;
		this.b=Constants.MINIMUM;
		this.c=Constants.MINIMUM;
		this.setValid(false);
	}

	public EquationCoefficients(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.setValid(true);
	}

	public double calculateDiscriminant() {
		return (b*b -4*a*c);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}




}
