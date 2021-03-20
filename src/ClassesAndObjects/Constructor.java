package ClassesAndObjects;

public class Constructor {
	
	String sModel;
    int iGear;
    int iHighestSpeed;
    String sColor;
    int iMake;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;
    
    // Syntax to create a constructor
    public Constructor( String Model, int Make, boolean LefthandDrive) {
    	sModel=Model;
    	iMake=Make;
    	bLeftHandDrive=LefthandDrive;
    	
    	iDoors=4;
		iGear=5;
		iHighestSpeed=200;
    	
    	
    	
    	
    }
    
    public void display_characterstics() {
    	
    	System.out.println("MOdel of car is " +sModel);

    	System.out.println("no. of Gears of car is " +iGear);
    	
    	System.out.println(" Color  of car is " +sColor);
    	
    	System.out.println("Make of car is " +iMake);
    	
    	System.out.println("high speed of car is " +iHighestSpeed);
    	
    	System.out.println(" Transmission of car is " +sTransmission);
    	
    	System.out.println("Tyres of car is " +iTyres);
    	
    	System.out.println("Doors of car is " +iDoors);
    	

    	System.out.println("gear of car is " +iGear);
    	System.out.println("High Speed of car is " +iHighestSpeed);
    }

}
