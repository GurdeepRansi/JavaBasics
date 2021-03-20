package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Assigning Values to an Array
You can create an array by using the new operator. Declaring an array variable, creating an array, 
and assigning the reference of the array to the variable can be combined in one statement. Syntax for creating an array is:

ArrayType [] ArrayName = New ArrayType [Size of an Array];*/
		
		
		// Example 1:
		String[] aCarMake1 = new String[100];
		
	      aCarMake1[0] = "BMW";
	      aCarMake1[1] = "AUDI";
	      aCarMake1[2] = "TOYOTA";
	      aCarMake1[3] = "SUZUKI";
	      aCarMake1[4] = "HONDA";

	   // Example 2:
	      String [] aCarMake2 = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};   
	}

}
