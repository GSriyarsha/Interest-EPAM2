/**
 * 
 */
package interests;

/**
 * @author Sriyarsha
 *This is a program to calculate Simple Interest and Compound Interest 
 */
public class Interest {
	/**
	 * Method to calculate Simple Interest
	 */
	public double simpleInterest(double principle, double rateOfInterest, double time){
		return ((principle * rateOfInterest * time) / 100);
	}
	/**
	 * Method to calculate Compound Interest
	 */
	public double compoundInterest(double principle, double rateOfInterest, double time){
		/**
		 * @param x 
		 * This is a parameter used for storing the Compoud Interest 
		 */
		double x = (1 + (rateOfInterest) / 100);
		double z = principle * (Math.pow(x , time));
		return z;
	}

}
