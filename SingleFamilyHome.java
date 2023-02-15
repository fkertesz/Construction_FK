/**
 * This class inherits from the Residential class and is utilized in the
 * Application class
 * @author Fanni
 * @version 1.0
 * Project 1
 * CS131
 */
public class SingleFamilyHome extends Residential
{
	
	private boolean garage;//this variable stores the availability of a garage
	
	/*
	 * empty-argument constructor initializes instance variables
	 */
	public SingleFamilyHome()
	{
		super();
		garage = false;
	}//end constructor
	
	/*
	 * preferred constructor initialized instance variables to preferred
	 * arguments
	 */
	public SingleFamilyHome(String pN, String cA, double tSF, String oG,
			String s, int nBd, int nBt, boolean lR, boolean garage)
	{
		super(pN, cA, tSF, oG, s, nBd, nBt, lR);
		this.garage = garage;
	}//end constructor
	
	/*
	 * @return garage availability
	 */
	public boolean getGarage()
	{
		return garage;
	}//end getGarage
	
	/*
	 * @param garage availability to be set
	 */
	public void setGarage(boolean garage)
	{
		this.garage =  garage;
	}//end setGarage
	
	/*
	 * preferred toString method
	 * @return variable values of SingleFamilyHome
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString

	/*
	 * @return text to the system output
	 */
	public void draw()
	{
		System.out.println("Drawing code for SingleFamilyHome");
	}//end draw
	
	/*
	 * @return data in set format in a String
	 */
	public String displayData()
	{
		String g;
		if(garage)
			g = "Y";
		else
			g = "N";
		String s = super.displayData() + 
				"Garage: " + g + "\n";
		return s;
	}//displayData
}//end class
