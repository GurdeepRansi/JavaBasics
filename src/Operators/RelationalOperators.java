package Operators;

public class RelationalOperators {

	public static void main(String[] args) {
		/*Relational Operators are used to determine the comparison between two or more objects. These operators always return the boolean value either true or false when used in an expression. In java we have six different relational operators:
		Greater than ‘>’ : This checks if the value of left operand is greater than value of right operand
		Less than ‘<‘ : This checks if the value of left operand is less than the value of right operand
		Greater than or Equal to ‘>=’ : This checks if the value of left operand is greater than or equal to the value of right operand
		Less than or Equal to ‘<=’ : This checks if the value of left operand is less than or equal to the value of right operand
		Equal ‘==’ : This checks if the value of both operands are equal
		Not Equal ‘!=’ : This checks if the value of two operands are not equal
		  */
		
		int Ten = 10; 
		 int Twenty = 20;
		 int Thirty = 30;
		 
		 System.out.println("<<<<<< GREATER THAN OPERATOR >>>>>>");
		 System.out.println(" Ten > Twenty ==> " + (Ten > Twenty)); //false
		 System.out.println(" Twenty > Ten ==> " + (Twenty > Ten)); //true
		 System.out.println(" Thirty > Twenty ==> " + (Thirty > Twenty)); //true
		 
		 System.out.println("<<<<<< GREATER THAN OR EQUAL TO OPERATOR >>>>>>");
		 System.out.println(" Ten >= Twenty ==> " + (Ten >= Twenty)); //false
		 System.out.println(" Twenty >= Ten ==> " + (Twenty >= Ten)); //true
		 System.out.println(" Thirty >= Twenty ==> " + (Thirty >= Twenty)); //true
		 
		 System.out.println("<<<<<< LESS THAN OPERATOR >>>>>>");
		 System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); //true
		 System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); //false
		 System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); //false
		 
		 //less than or equal to
		 System.out.println("<<<<<< LESS THAN OR EQUAL TO OPERATOR >>>>>>");
		 System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); //true
		 System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); //false
		 System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); //false
		 
		 //equal to
		 System.out.println("<<<<<< EQUAL TO OPERATOR >>>>>>");
		 System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); //false
		 System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty+Ten)); //true
		 
		 //not equal to
		 System.out.println("<<<<<< NOT EQUAL TO OPERATOR >>>>>>");
		 System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); //true
		 System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); //false

	}

}
