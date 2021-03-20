package strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String WebSite = "QA Course";

		/*As with any other object, you can also create String objects by using the new keyword and a constructor.*/
		char[] webSiteName = { 'G', 'O', 'O', 'G', 'L', 'E'};
		String webSite = new String(webSiteName);  
		System.out.println( webSite );
		//System.out.println( webSiteName );
		
		   //Declaring the String and Int Variable
		   String sPopularTopic = "Selenium Automation Framework";
		   int ilength = sPopularTopic.length();
		 
		   //Print the value of String variable & int Variable
		   System.out.println("Popular Topic of QA Automation: " +  sPopularTopic);
		   System.out.println("Length of the Popular Topic: " +  ilength);
		   
		   //Concatenating String
		   //Declaring the String Variables
		   String sPopularTopic_1 = "Selenium Automation Framework";
		   String sPopularTopic_2 = "Basic Java Tutorial";
		   String sSpace = " ";
	}

}
