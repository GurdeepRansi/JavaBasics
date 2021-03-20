package Operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		/* Arithmetic operators perform the same basic operations you would expect if you used them in mathematics. 
		 * They take two operands and return the result of the mathematical calculation. There are seven important 
		 * arithmetic operators available in Java:

		Addition ‘+’ : This adds two numbers or concatenate two strings
		Subtraction ‘-‘ : This subtracts right-side operand from the left side operand
		Multiplication ‘*’ : This multiplies two numbers
		Division ‘/’ : This divides left side operand by the right side operand
		Modulo ‘%’ : This divides left side operand by the right side operand and returns the remainder
		Increment ‘++’ : This increases the value by 1
		Decrement ‘- -‘ : This decreases the value by 1 */
		
		 int a, b = 10, c = 5;
		 a = b + c;
		 System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
		 a = b - c;
		 System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
		 a = b * c;
		 System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
		 a = b / c;
		 System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
		 a = b % c;
		 System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
		 b++;
		 System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
		 c--;
		 System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);

	}

}
