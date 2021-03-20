package arrays;

public class PassingArrayToMethod {

	public static void main(String[] args) {
		/*An array can be easily passed to a method as a parameter, just like we pass integers and strings to methods. 
		 * In the below example aMake array is passed to Print_Array() method.*/
		//Declaring an Array
		 String [] aMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		 // Calling Print Array method and passing an Array as a parameter
		 Print_Array(aMake);
		 
		 }
		 
		 //This accept Array as an argument of type String 
		 public static void Print_Array(String []array){
		 
		 for(int i = 0;i<=array.length-1;i++){
		 System.out.println("Printing all the values of an Array ==> " + array[i]);
		 }
		
	}

}

