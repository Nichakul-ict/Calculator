// File: StatKalculator
// Description: implement a simple statistics calculator
// Project Number: P0
//
// ID: 6588178
// Name: Nichakul Kongnual
// Section: 2
//
// On my honor, Nichakul Kongnual, this project is my own work
// and I have not provided this code to any other students.

import java.util.*;
public class StatKalculator {
	
	//******INSERT YOUR CODE HERE***********
	//Class attributes go here
	ArrayList<Double> n = new ArrayList<Double>();
	//**************************************
	
	/**
	 * Constructor is the first method to be called at instantiation of a Kalculator object.
	 * If you need to initialize your object, do so here. 
	 */
	public StatKalculator()
	{
		//******INSERT YOUR CODE HERE***********
		
		//**************************************
	}
	
	/**
	 * Add *number* to the list of numbers. 
	 * @param number
	 */
	public void addNumber(double number)
	{
		//******INSERT YOUR CODE HERE***********
		n.add(number);
		//**************************************
	}
	/**
	 * Print the numbers in the list in the following format:
	 * DATA[<N>]:[<n1>, <n2>, <n3>, ...]
	 * Where N is the size of the list. <ni> is the ith number in the list.
	 * E.g., "DATA[4]:[1.0, 2.0, 3.0, 4.0]"
	 */
	public void printData()
	{
		//******INSERT YOUR CODE HERE***********
		System.out.printf("DATA[%d]",n.size());
		System.out.println(n);
		
		//**************************************
	}
	/**
	 * Find and return the maximum of all the numbers in the list.
	 * If the list is empty, return 0.
	 */
	public double getMax()
	{
		//******INSERT YOUR CODE HERE***********
		if(n.size()==0)
			return 0;
		double  max = n.get(0);
		for(int i=0; i< n.size(); i++) {
			if(n.get(i) > max) {
				max = n.get(i);
			}
		}
		return max;
		//**************************************
	}
	/**
	 * Find and return the minimum of all the numbers in the list.
	 * If the list is empty, return 0.
	 */
	public double getMin()
	{
		//******INSERT YOUR CODE HERE***********
		if(n.size()==0)
			return 0;
		double  min = n.get(0);
		for(int i=0; i< n.size(); i++) {
			if(n.get(i) < min) {
				min = n.get(i);
			}
		}
		return min;
		//**************************************
	}
	/**
	 * Find and return the range of the numbers in the list (MAX - MIN). 
	 * If the list is empty, return 0.
	 */
	public double getRange()
	{
		//******INSERT YOUR CODE HERE***********
		if(n.size()==0)
			return 0;
		double range = getMax()-getMin();
		return range;
		//**************************************
	}
	/**
	 * Find and return the maximum k numbers of all the numbers in the list as an array of k double numbers.
	 * The order of the returned k numbers does not matter. (We only care if you can get the max k elements)
	 * If the list has fewer than k numbers, return null.
	 */
	public double[] getMaxK(int k)
	{
	     
		//******INSERT YOUR CODE HERE***********

		 if(k > n.size())
	     {
	       return null;
	     }
         for(int i = 0; i < n.size(); i++){
        	 for(int j=1; j<n.size(); j++){
              if(n.get(j) < n.get(j-1)){
	                     double t = n.get(j);
	                     n.set(j, n.get(j-1));
                         n.set(j-1, t);             
             }
	      }
        }
	       double arr[]= new double[k];
      for(int i=0;i<k;i++)
	  {
	    arr[i]=n.get(n.size()-(i+1));
	  }
	  return arr;
     
		//**************************************
   }
	/**
	 * Find and return the minimum k numbers of all the numbers in the list as an array of k double numbers.
	 * The order of the returned k numbers does not matter. (We only care if you can get the min k elements)
	 * If the list has fewer than k numbers, return null.
	 */
	public double[] getMinK(int k)
	{
			
			//******INSERT YOUR CODE HERE***********
	          
		    if(k > n.size())
	        {
	          return null;
	        }
            for(int i = 0; i < n.size(); i++){
        	  for(int j=1; j<n.size(); j++){
                if(n.get(j) > n.get(j-1)){
	                     double t = n.get(j);
	                     n.set(j, n.get(j-1));
                         n.set(j-1, t);             
             }
	      }
        }
	       double arr[]= new double[k];
      for(int i=0;i<k;i++)
	  {
	    arr[i]=n.get(n.size()-(i+1));
	  }
	  return arr;
		
			//**************************************
	   }
	/**
	 * Calculate the summation of all the numbers in the list, then returns the sum. 
	 * If the list is empty, return 0.
	 */
	public double getSum()
	{
		//******INSERT YOUR CODE HERE***********
		if(n.size()==0)
			return 0;
		double sum = 0;
		for(int i=0; i<n.size(); i++) {
			sum+=n.get(i);
		}
		return sum;
		//**************************************
	}
	
	/**
	 * Calculate and return the mean (average) of all the numbers in the list.
	 * If the list is empty, return 0.
	 */
	public double getMean()
	{
		//******INSERT YOUR CODE HERE***********
		if(n.size()==0)
			return 0;
		return getSum()/n.size();		
		//**************************************
	}
	/**
	 * Calculate and return the Geometric Mean of all the numbers in the list.
	 * If the list is empty, return 0.
	 */
	public double getGeometricMean()
	{
		//******INSERT YOUR CODE HERE***********
		if(n.size()==0)
			return 0;
		double gtm = 0;
		double s=1;
		
		for(int i=0; i<n.size(); i++) {
			s *= n.get(i);
		}
		if(s>1) {
			gtm = Math.pow(s,(double)1/n.size());
		}
		return gtm;
		//**************************************
	}
	
}
