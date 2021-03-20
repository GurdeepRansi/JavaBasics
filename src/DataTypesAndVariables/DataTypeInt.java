package DataTypesAndVariables;

public class DataTypeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Integer data type is used to store numeric/numbers in the variable. 
		 * In technical term, an integer store 32- bit of information and it stores 
		 * the value between -2,147,483,648 and 2,147,484,647. But a decimal number 
		 * can not be stored in the ‘int‘ data type.*/
		
		//Use the int keyword to declare integer variable
        int carSpeed;
 
 //Initialize the integer variable with value 20
        carSpeed = 20;
 
 //Print the value of integer variable
 System.out.println("Car is running at the speed of: " +  carSpeed + " km/h");
 
 //Change the value of integer variable
 carSpeed = carSpeed + 20;
 
 //Print the value of integer variable
 System.out.println("Current speed of the car is: " +  carSpeed);
	 
	}

}
