package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Logical operators return a true or false value based on the state of the Variables. 
		 * Each argument to a logical operator must be a boolean data type, and the result is 
		 * always a boolean data type. Below are the three most commonly used logical operators:
		And Operator ‘&&’ : This returns true if the output of both the operands are true
		OR Operator ‘||’ : This returns true if the output of either operands are true
		NOT Operator ‘!’ : This inverts the state of the condition*/
		boolean Output_1 = true;
		 boolean Output_2 = false;
		 System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));
		 System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));
		 System.out.println("Change the state of the Output_1 to false : " + (!Output_1));
	}

}
