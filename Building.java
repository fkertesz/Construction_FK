/**
 * This class is the highest parent class from which the other
 * classes representing buildings will inherit from
 * @author Fanni
 * @version 1.0
 * Project 1
 * CS131
 */
public class Building
{
	protected String projectName;//variable stores project name
	protected String completeAddress;//variable stores complete address
	protected double totalSquareFeet;//variable stores total square feet
	protected String occupancyGroup;//variable stores occupancy group
	protected String subgroup;//variable stores subgroup
	
	/*
	 * empty-argument constructor to initialize instance variables
	 */
	public Building()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0;
		occupancyGroup = "";
		subgroup = "";
	}//end constructor
	
	/*
	 * preferred constructor to intialize instance variables to
	 * preferred arguments
	 */
	public Building(String projectName,String completeAddress,
			double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end constructor
	
	/*
	 * @return project name
	 */
	public String getProjectName()
	{
		return projectName;
	}//end getProjectName
	
	/*
	 * @return complete address
	 */
	public String getCompleteAddress()
	{
		return completeAddress;
	}//end getCompleteAddress
	
	/*
	 * @return total square feet
	 */
	public double getTotalSquareFeet()
	{
		return totalSquareFeet;
	}//end getTotalSquareFeet
	
	/*
	 * @return occupancy group
	 */
	public String getOccupancyGroup()
	{
		return occupancyGroup;
	}//end getOccupancyGroup
	
	/*
	 * @return subgroup
	 */
	public String getSubgroup()
	{
		return subgroup;
	}//end getSubgroup
	
	/*
	 * @param project name to be set
	 */
	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}//end setProjectName
	
	/*
	 * @param complete address to be set
	 */
	public void setCompleteAddress(String completeAddress)
	{
		this.completeAddress = completeAddress;
	}//end setCompleteAddress
	
	/*
	 * @param total square feet to be set
	 */
	public void setTotalSquareFeet(double totalSquareFeet)
	{
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet
	
	/*
	 * @param occupancy group to be set
	 */
	public void setOccupancyGroup(String occupancyGroup)
	{
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup
	
	/*
	 * @param sub group to be set
	 */
	public void setSubgroup(String subgroup)
	{
		this.subgroup = subgroup;
	}//end setSubgroup
	
	/*
	 * preferred toString method
	 * @return variable values of Building
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString

	/*
	 * @return text to the system output
	 */
	public void draw()
	{
		System.out.println("Drawing code for Building");
	}//end draw
	
	/*
	 * @return data in set format in a String
	 */
	public String displayData()
	{
		String s;
		s = "Project Name: " + projectName + "\n" +
				"Address: " + completeAddress + "\n" +
				"Square Feet: " + totalSquareFeet + "\n" +
				"Occupancy Group: " + occupancyGroup + "\n" +
				"Occupancy Subgroup: " + subgroup + "\n";
		return s;
	}//end displayData
}//end class
