/**
 * This class inherits from the Building class and is the parent class
 * from which the Apartment and SingleFamilyHome classes inherit from
 * @author Fanni
 * @version 1.0
 * Project 1
 * CS131
 */
public class Residential extends Building
{
	protected int numBedrooms;//variable stores number of bedrooms
	protected int numBathrooms;//variable stores number of bathrooms
	protected boolean laundryRoom;//variable stores laundry room availability status
	
	/*
	 * empty-argument constructor initializes instance variables
	 */
	public Residential()
	{
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end constructor
	
	/*
	 * preferred constructor initialized instance variables to preferred
	 * arguments
	 */
	public Residential(String pN, String cA, double tSF, String oG,
			String s, int numBedrooms, int numBathrooms, boolean laundryRoom)
	{
		super(pN, cA, tSF, oG, s);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end constructor
	
	/*
	 * @return number of bedrooms
	 */
	public int getNumBedrooms()
	{
		return numBedrooms;
	}//end getNumBedrooms
	
	/*
	 * @return number of bathrooms
	 */
	public int getNumBathrooms()
	{
		return numBathrooms;
	}//end getNumBathrooms
	
	/*
	 * @return laundry room availability
	 */
	public boolean getLaundryRoom()
	{
		return laundryRoom;
	}//end getLaundryRoom
	
	/*
	 * @param number of bedrooms to be set
	 */
	public void setNumBedrooms(int numBedrooms)
	{
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms
	
	/*
	 * @param number of bathrooms to be set
	 */
	public void setNumBathrooms(int numBathrooms)
	{
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms
	
	/*
	 * @param laundry room availability to be set
	 */
	public void setLaundryRoom(boolean laundryRoom)
	{
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	/*
	 * preferred toString method
	 * @return variable values of Residential
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}//end toString

	/*
	 * @return text to the system output
	 */
	public void draw()
	{
		System.out.println("Drawing code for Residential");
	}//end draw
	
	/*
	 * @return data in set format in a String
	 */
	public String displayData()
	{
		String lR;
		if(laundryRoom)
		lR = "Y";
		else
		lR = "N";
		String s = super.displayData() +
				"Number of Bedrooms: " + numBedrooms + "\n" +
				"Number of Bathrooms: " + numBathrooms + "\n" +
				"Laundry Room: " + lR + "\n";
		return s;
	}//end displayData
}//end class
