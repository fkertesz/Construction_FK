/**
 * This class inherits from the Building class and is the parent class
 * from which the Mall class inherits from
 * @author Fanni
 * @version 1.0
 * Project 1
 * CS131
 */
public class Business extends Building
{
	protected int numRentableUnits;//this variable stores the number of rentable units
	
	/*
	 * empty-argument constructor initializes instance variables
	 */
	public Business()
	{
		super();
		numRentableUnits = 0;
	}//end constructor
	
	/*
	 * preferred constructor initialized instance variables to preferred
	 * arguments
	 */
	public Business(String pN, String cA, double tSF, String oG,
			String s, int numRentableUnits)
	{
		super(pN, cA, tSF, oG, s);
		this.numRentableUnits = numRentableUnits;
	}//end constructor
	
	/*
	 * @return number of rentable units
	 */
	public int getNumRentableUnits()
	{
		return numRentableUnits;
	}//end getNumRentableUnits
	
	/*
	 * @param number of rentable units to be set
	 */
	public void setNumRentableUnits(int numRentableUnits)
	{
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	/*
	 * preferred toString method
	 * @return variable values of Business
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString

	/*
	 * @return text to the system output
	 */
	public void draw()
	{
		System.out.println("Drawing code for Business");
	}//end draw
	
	/*
	 * @return data in set format in a String
	 */
	public String displayData()
	{
		String s = super.displayData() +
				"Number of Rentable Units: " + numRentableUnits + "\n";
		return s;
	}//end displayData
}//end class
