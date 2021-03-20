package DecisionMaking;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) The “expression” must be of type byte, short, int, or char.
		2) A switch statement can have an optional default case, which must appear at the end of the switch. 
		The default case can be used for performing a task when none of the cases is true. No break is needed in the default case.
		3) Each case must end with colon (:)
		4) Each case value must be a unique literal(constant not a variable). Duplicate case value not allowed.
		5) Typically each case has a trailing break and a break acts as an exit point.*/
				int iDay = 1;
				 String sDay = "Monday";
				 
				 switch(iDay){
				 case 1:
				 System.out.println("Today is Monday");
				 break;
				 case 3:
				 System.out.println("Today is Tuesday");
				 break;
				 case 4:
				 System.out.println("Today is Wednesday");
				 break;
				 case 5:
				 System.out.println("Today is Thursday");
				 break;
				 case 6:
				 System.out.println("Today is Friday");
				 break;
				 case 7:
				 System.out.println("Today is Saturday");
				 break;
				 default:
				 System.out.println("Today is Sunday");
				 break;
				 }
				 
				 switch(sDay){
				 case "Monday":
				 System.out.println("Today is Monday");
				 break;
				 case "Tuesday":
				 System.out.println("Today is Tuesday");
				 break;
				 case "Wednesday":
				 System.out.println("Today is Wednesday");
				 break;
				 case "Thursday":
				 System.out.println("Today is Thursday");
				 break;
				 case "Friday":
				 System.out.println("Today is Friday");
				 break;
				 case "Saturday":
				 System.out.println("Today is Saturday");
				 break;
				 default:
				 System.out.println("Today is Sunday");
				 break;
				 }

	}

}
