import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	
        	NumberFormat df = NumberFormat.getNumberInstance();
        	df.setMaximumFractionDigits(2);
        	
        	
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
           double gallons = sc.nextDouble();
   //         String gallons1String = sc.next();
            
   //         BigDecimal gallons1 = new BigDecimal(gallons1String);
            
            
            double mpg = miles/gallons;
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println(); 
            
            int mpg2 = (int)Math.round(mpg);
            System.out.println("Miles per gallon is " + mpg2 + ".");
            System.out.println(); 
            
            double mpg3 = (double)Math.round(mpg*100)/100;
            System.out.println("Miles per gallon is " + mpg3 + ".");
            System.out.println();
            
            String mpg4 = df.format(mpg);
            System.out.println("Miles per gallon is " + mpg4 + ".");
            System.out.println();
            
            
            
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
            
        }
    }
    
}
