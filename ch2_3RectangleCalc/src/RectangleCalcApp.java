import java.util.Scanner;
public class RectangleCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Rectangle Calculator.");
        
    //    System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

   
        
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the  numGrade from the user
        	
        	
            System.out.print("Enter Length:   ");
           double Length = sc.nextDouble();
           System.out.print("Enter Width:   ");
           double Width = sc.nextDouble();
           
           double area;
            area = Width * Length;
            double Perimiter;
            Perimiter = (Width * 2) + (Length * 2);
           

            String message = "Area: " + area + "\n"
            				+ "Perimiter: " + Perimiter + "\n";  
            
     System.out.println(message);
     System.out.print("Continue? (y/n): ");
     choice = sc.next();
     System.out.println();
        }


	}

}
