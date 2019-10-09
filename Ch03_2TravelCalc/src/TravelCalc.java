import java.util.Scanner;
public class TravelCalc {

	public static void main(String[] args) {
		 System.out.println("Welcome to the travel time calculator");
	        System.out.println();  // print a blank line
	        
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            System.out.print("Enter miles : ");
	            double miles = sc.nextDouble();
	            
	            System.out.print("Enter mph: ");
	            double mph = sc.nextDouble();
	            
	            
	            
	            
	            double time= miles/mph;
	            int hrs = (int)Math.round(time*60)/60;
	            
	            System.out.println("Hours is " + hrs + ".");
	            System.out.println(); 
	            
	    //      double min = (double)Math.round(time*60)/60;
	        
	            double result = time*60 % 60;
	  //         System.out.println(result);
	            
	            int minutes = (int)Math.round(result);
	            		System.out.println("Minutes is " + minutes);
	            
	     //      60 * remainder = minutes
	          //another way to do it  		
	            //		double hours = miles/mph;
	            	//	int min = (int)(hours *60);
	            		//int hoursInt = min/60;
	            			//	min %=60;
	            
	            System.out.print("Calculate another MPG? (y/n): ");
	            choice = sc.next();
	            System.out.println();
	        }
	}

}
