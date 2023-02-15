/**
 * This class inherits from the Residential class and is utilized in the
 * Application class
 * @author Fanni
 * @version 1.0
 * Project 1
 * CS131
 */
public class Apartment extends Residential
{
	private int numRentableUnits;//this variable stores the number rentable units
	private double avgUnitSize;//this variable stores the average unit size
	private boolean parkingAvailable;//this variable stores the parking availability
	
	/*
	 * empty-argument constructor initializes instance variables
	 */
	public Apartment()
	{
		super();
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}//end constructor
	
	/*
	 * preferred constructor initialized instance variables to preferred
	 * arguments
	 */
	public Apartment(String pN, String cA, double tSF, String oG,
			String s, int nBd, int nBt, boolean lR,
			int numRentableUnits, double avgUnitSize, boolean parkingAvailable)
	{
		super(pN, cA, tSF, oG, s, nBd, nBt, lR);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end constructor
	
	/*
	 * @return number of rentable units
	 */
	public int getNumRentableUnits()
	{
		return numRentableUnits;
	}//end getNumRentableUnits
	
	/*
	 * @return average unit size
	 */
	public double getAvgUnitSize()
	{
		return avgUnitSize;
	}//end getAvgUnitSize
	
	/*
	 * @return parking availability
	 */
	public boolean getParkingAvailable()
	{
		return parkingAvailable;
	}//end getParkingAvailable
	
	/*
	 * @param number of rentable units to be set
	 */
	public void setNumRentableUnits(int numRentableUnits)
	{
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
	/*
	 * @param average unit size to be set
	 */
	public void setAvgUnitSize(double avgUnitSize)
	{
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize
	
	/*
	 * @param parking availability to be set
	 */
	public void setParkingAvailable(boolean parkingAvailable)
	{
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable

	/*
	 * preferred toString method
	 * @return variable values of Apartment
	 */
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString

	/*
	 * @return text to the system output
	 */
	public void draw()
	{
		System.out.println("Drawing code for Apartment");
	}//end draw
	
	/*
	 * @return data in set format in a String
	 */
	public String displayData()
	{
		String pA;
		if(parkingAvailable)
			pA = "Y";
		else
			pA = "N";
		String s = super.displayData() +
				"Number of Rentable Units: " + numRentableUnits + "\n" +
				"Average Unit Size: " + avgUnitSize + "\n" +
				"Parking Avaiable: " + pA + "\n";
		return s;
	}//end displayData
}//end class
