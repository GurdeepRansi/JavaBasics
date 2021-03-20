package arrays;

public class ReturningArrayFromMethod {

	public static void main(String[] args) {
		/*A method may also return an array. The way we return any other data type from a method, array can also be returned 
		 * in the same way. Just mention the type of array in the method declaration followed by [ ]. In the below example 
		 * an array of type string is returned from a method ReturnArray().*/
		 String[] aMake = ReturnArray();
		 String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"}; 
		 String[] aMake1 =  aArray;
		 
		 for(int i = 0;i<=aMake.length-1;i++){
		 System.out.println("Printing all the values of an Array ==> " + aMake[i]);
		 }
		 }
		 
		 //This method returns an Array of type String
		 public static String[] ReturnArray() {
		 String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};  
		   return aArray;
	}

}
