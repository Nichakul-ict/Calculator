/**
 * This class is responsible for testing StatKalculator.
 * --------- DO NOT MODIFY THIS FILE --------------
 * @author Suppawong and Siripen
 */

import java.util.Arrays;
import java.text.DecimalFormat;

public class StatKalculatorTester {
	
	// List of numbers in each test case
	public static final double[][] TEST_CASES = {
			{1, 2, 3, 4, 5},
			{10, 2, 108, 205, 38, 23, 21, 23},
			{682.09,331.29,181.88,21.29,704.67,645.85,560.72,313.93,953.94,167.16,531.2,666.64,33.12,511.84,68.89,948.38,321.84,475.4,263.34,74.76,822.64,799.49,583.14,179.9,51.63,374.06,314.46,556.45,513.99,357.39,414.77,283.54,427.97,458.55,337.43,262.65,145.04,871.99,543.67,144.36,884.02,262.75,739.93,510.22,936.9,376.83,380.21,750.65,79.58,882.8,922.88,689.68,928.14,64.94,798.16,578.58,148.89,135.27,838.42,158.37,742.14,633.17,896.84,661.7,290.45,450.54,295.79,930.37,843.59,847.29,843.5,797.74,584.26,64.32,608.96,34.56,919.56,629.36,571.24,669.55,623.55,847.29,769.36,247.26,129.07,960.55,682.91,947.63,238.06,830.3,659.7,306.05,433.78,625,284.26,558.45,290.04,947.05,711.88,678.27},
			{345.15},
			{}
	};
	
	// Value of K in each test case
	public static final int[] K = {2,3,4,5,6};
	
	// To display number in 2 decimal places
	private static final DecimalFormat df = new DecimalFormat("00.00");
	
	public static void test(double[] data, int k) {
		
		StatKalculator sktor = new StatKalculator();
		System.out.println("@@@ Loading data:");
		for(int i = 0; i < data.length; i++) {
			sktor.addNumber(data[i]);
		}
		sktor.printData();
		System.out.println("@@@ Min: " + sktor.getMin());
		System.out.println("@@@ Min "+ k + " numbers: " + 
				Arrays.toString(sktor.getMinK(k)) + " //order does not matter");
		System.out.println("@@@ Max: " + sktor.getMax());
		System.out.println("@@@ Max "+ k + " numbers: " + 
				Arrays.toString(sktor.getMaxK(k)) + " //order does not matter");
		System.out.println("@@@ Range: " + sktor.getRange());
		System.out.println("@@@ Sum: " + df.format(sktor.getSum()));
		System.out.println("@@@ Mean: " + df.format(sktor.getMean()));
		System.out.println("@@@ Geometric Mean: " + df.format(sktor.getGeometricMean()));
		System.out.println();
	}
	
	/**
	 * The main method to execute your program
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("---- Welkome to StatKalculator ----");
		for(int i = 0; i < TEST_CASES.length; i++)
		{
			System.out.println("@@ ========== TestCase "+(i+1)+" =========== @@");
			test(TEST_CASES[i], K[i]);
		}
		System.out.println("---- Well Done! Bye. ----");
	}
	// End of file
}
