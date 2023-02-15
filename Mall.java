/**
 * This class inherits from the Business class and is utilized in
 * the Application class
 * @author Fanni
 * @version 1.0
 * Project 1
 * CS131
 */
public class Mall extends Business
{
	private int numRentedUnits;//this variable stores the number of rented units
	private double medianUnitSize;//this variable stores the median unit size
	private int numParkingSpaces;//this variable stores the number of parking spaces
	
	/*
	 * empty-argument constructor initializes instance variables
	 */
	public Mall()
	{
		super();
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}//end constructor
	
	/*
	 * preferred constructor initialized instance variables to preferred
	 * arguments
	 */
	public Mall(String pN, String cA, double tSF, String oG,
			String s, int nRU, int numRentedUnits,
			double medianUnitSize, int numParkingSpaces)
	{
		super(pN, cA, tSF, oG, s, nRU);
		this.numRentedUnits= numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces= numParkingSpaces;
	}//end constructor
	
	/*
	 * @return number of rented units
	 */
	public int getNumRentedUnits()
	{
		return numRentedUnits;
	}//end getNumRentedUnits
	
	/*
	 * @return median unit size
	 */
	public double getMedianUnitSize()
	{
		return medianUnitSize;
	}//end getMedianUnitSize
	
	/*
	 * @return number of parking spaces
	 */
	public int getNumParkingSpaces()
	{
		return numParkingSpaces;
	}//end getNumParkingSpaces
	
	/*
	 * @param number of rented units to be set
	 */
	public void setNumRentedUnits(int numRentedUnits)
	{
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits
	
	/*
	 * @param median unit size to be set
	 */
	public void setMedianUnitSize(double medianUnitSize)
	{
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	
	/*
	 * @param number of parking spaces to be set
	 */
	public void setNumParkingSpaces(int numParkingSpaces)
	{
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	/*
	 * preferred toString method
	 * @return variable values of Mall
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString

	/*
	 * @return text to the system output
	 */
	public void draw()
	{
		System.out.println("Drawing code for Mall");
	}//end draw
	
	/*
	 * @return data in set format in a String
	 */
	public String displayData()
	{
		String s = super.displayData() +
				"Number of Rented Units:" + numRentedUnits + "\n" +
				"Median Unit Size: " + medianUnitSize + "\n" +
				"Number of Parking Spaces: " + numParkingSpaces + "\n";
		return s;
	}//end displayData
}//end class
