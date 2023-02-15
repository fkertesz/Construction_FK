/**
 * This application class tests the constructors, the setters/getters
 * and methods of the Mall, Apartment, SingleFamilyHome classes 
 * @author Fanni
 * @version 1.0
 * Project 1
 * CS131
 */
public class Application
{
	/*
	 * Main method allows execution of the class
	 * @param String[] args, command line arguments
	 */
	public static void main(String[] args)
	{
	Mall mallA = new Mall();//declares new Mall object
	Mall mallB = new Mall("project1", "unique address 1", 111.11, "G1", "S1",
			1, 11, 11.1, 111);//instantiates new Mall object
	
	Apartment apartmentA = new Apartment();//declares new Apartment object
	Apartment apartmentB = new Apartment("project2", "unique address 2",
			222.22, "G2", "S2", 2, 2, false, 22, 222.2, true);
	//instantiate new Apartment object
	
	SingleFamilyHome sFHomeA = new SingleFamilyHome();
	//declares new SingleFamilyHome object
	SingleFamilyHome sFHomeB = new SingleFamilyHome("project3",
			"unique address 3", 333.33, "G3", "S3", 3, 3, true, true);
	//instantiates new SingleFamilyHome object
	
	//testing the setters inherited from the Building class
	mallA.setProjectName("new project");
	mallA.setCompleteAddress("new address");
	mallA.setTotalSquareFeet(777.77);
	mallA.setOccupancyGroup("new grup");
	mallA.setSubgroup("new subgroup");
	
	//testing the setter inherited from the Business class
	mallA.setNumRentableUnits(7);
	
	//testing the setters of the Mall class
	mallA.setNumRentedUnits(77);
	mallA.setMedianUnitSize(77.77);
	mallA.setNumParkingSpaces(777);
	
	//testing the setters inherited from the Residential class
	apartmentA.setNumBedrooms(8);
	apartmentA.setNumBathrooms(2);
	apartmentA.setLaundryRoom(true);
	
	//testing the setters of the Apartment class
	apartmentA.setNumRentableUnits(88);
	apartmentA.setAvgUnitSize(88.88);
	apartmentA.setParkingAvailable(true);

	//testing the setter of the SingleFamilyHome class
	sFHomeA.setGarage(true);
	
	//testing the draw class
	mallA.draw();
	
	//testing the toString method
	System.out.println(mallA.toString() + "\n");
	
	/*
	 * Testing the getters inherited from the Building, Business, Residential
	 * classes, and the getters from the Mall, Apartment, SingleFamilyHome
	 * classes
	 */
	System.out.println(
			"mallA: project name: " + mallA.getProjectName() +
			"\n\taddress: " + mallA.getCompleteAddress() + 
			"\n\t sq feet: " + mallA.getTotalSquareFeet() +
			"\n\t group: " +  mallA.getOccupancyGroup() +
			"\n\t subgroup: " + mallA.getSubgroup() +
			"\n\t number of rentable units: " + mallA.getNumRentableUnits() +
			"\n\t number of rented units: " + mallA.getNumRentedUnits() +
			"\n\t median unit size: " + mallA.getMedianUnitSize() + 
			"\n\t number of parking spaces: " + mallA.getNumParkingSpaces() +
			"\n apartmentA: number of bedrooms: " + apartmentA.getNumBedrooms() +
			"\n\t number of bathrooms: " + apartmentA.getNumBathrooms() +
			"\n\t laundry room available: " + apartmentA.getLaundryRoom() +
			"\n\t number of rentable units: " + apartmentA.getNumRentableUnits() +
			"\n\t average unit size: " + apartmentA.getAvgUnitSize() +
			"\n\t parkinb available: " + apartmentA.getParkingAvailable()+
			"\n sFHomeA: garage available: " + sFHomeA.getGarage() + "\n");
	
	//testing the displayData method and checking the setters methods
	//and instantiations
	System.out.println(mallA.displayData());
	System.out.println(mallB.displayData());
	System.out.println(apartmentA.displayData());
	System.out.println(apartmentB.displayData());
	System.out.println(sFHomeA.displayData());
	System.out.println(sFHomeB.displayData());
	}//end main
}//end class
