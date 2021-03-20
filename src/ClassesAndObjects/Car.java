package ClassesAndObjects;

 class Car {
	//Class Member Variables & Fields
		String sModel;
	    int iGear;
	    int iHighestSpeed;
	    String sColor;
	    int iMake;
	    boolean bLeftHandDrive;
	    String sTransmission;
	    int iTyres;
	    int iDoors;
	    
	    
	    public void display_characterstics() {
	    	
	    	System.out.println("MOdel of car is " +sModel);

	    	System.out.println("no. of Gears of car is " +iGear);
	    	
	    	System.out.println(" Color  of car is " +sColor);
	    	
	    	System.out.println("Make of car is " +iMake);
	    	
	    	System.out.println("high speed of car is " +iHighestSpeed);
	    	
	    	System.out.println(" Transmission of car is " +sTransmission);
	    	
	    	System.out.println("Tyres of car is " +iTyres);
	    }
	
}
