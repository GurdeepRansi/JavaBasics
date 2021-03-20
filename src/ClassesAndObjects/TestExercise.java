package ClassesAndObjects;

public class TestExercise {

	public static void main(String[] args) {
		 //Use the Car keyword to declare Car Class variable
		 Car Toyota;
		 
		 
		 //Initialize the Toyota variable with a new Car object
		 Toyota = new Car();
		 
		 
		// Car Toyota = new Car();
		 
		 Toyota.iDoors=4;
		 Toyota.iGear=5;
		 Toyota.iHighestSpeed=200;
		 Toyota.iMake=2018;
		 Toyota.iTyres=4;
		 Toyota.sColor="blue";
		 Toyota.sTransmission="Automatic";
		 Toyota.sModel="corolla";
		 
		 Toyota.display_characterstics();
		 
		 
		 }
	}
