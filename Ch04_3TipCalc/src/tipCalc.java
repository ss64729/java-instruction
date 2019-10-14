import java.text.NumberFormat;
import java.util.Scanner;
public class tipCalc {

	public static void main(String[] args) {
		 System.out.println("Welcome to the Tip calculator");
	        System.out.println();  // print a blank line
	        
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        final double FIFTEEN = .15;
	        final double SEVENTEEN = .17;
	        final double TWENTY = .20;
	        final double TWENTYFIVE = .25;
	        
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	        	
	        	NumberFormat df = NumberFormat.getNumberInstance();
	        	df.setMaximumFractionDigits(2);
	        	NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	        	
	            System.out.print("Enter meal total: ");
	            double meal= sc.nextDouble();
	            System.out.println("Cost of Meal " + currency.format(meal) + ".");
	            System.out.println(); 
	    
	        	// for (double r=.15; r<=.25; r+=.05)        	
	        	//Bigdecimal rate = new BigDecimal(r);
	            
	            double tip15 = meal * FIFTEEN;
	            		System.out.println("15% is " + currency.format(tip15) + ".");
	            System.out.println("total is " + currency.format(tip15 + meal) + ".");
	            System.out.println(); 
	            double tip17 = meal * SEVENTEEN;
        		System.out.println("17% is " + currency.format(tip17) + ".");
        System.out.println("total is " + currency.format(tip17 + meal) + ".");
        System.out.println(); 
        double tip20 = meal * TWENTY;
		System.out.println("20% is " + currency.format(tip20) + ".");
System.out.println("total is " + currency.format(tip20 + meal) + ".");
System.out.println(); 
double tip25 = meal * TWENTYFIVE;
System.out.println("25% is " + currency.format(tip25) + ".");
System.out.println("total is " + currency.format(tip25 + meal) + ".");
	            
System.out.println();        
	            
	            
	            
	            System.out.print("Calculate another ? (y/n): ");
	            choice = sc.next();
	            System.out.println();
	            
	        }
	  

	}

}
