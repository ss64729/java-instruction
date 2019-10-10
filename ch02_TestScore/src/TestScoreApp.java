import java.util.Scanner;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
    //    System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice numGrade from the user
            System.out.print("Enter Numerical Grade:   ");
            double numGrade = sc.nextDouble();

            // calculate the discount amount and total
            String letterGrade;
            
            if (numGrade > 100 )  {
                letterGrade = "Over Achiever!";
            
            } else if (numGrade >= 88 && numGrade <= 100) {
                letterGrade = "A";
            } else if (numGrade <= 87 && numGrade >= 80 ) {
                letterGrade = "B";
            } else if (numGrade <= 79 && numGrade >= 67) {
                letterGrade = "C";
            } else if (numGrade <= 67 && numGrade >= 60) {
                letterGrade = "D";   
            } else {
                letterGrade = "F";
            }
            String message = "Letter grade: " + letterGrade + "\n";
                        
     System.out.println(message);
     System.out.print("Continue? (y/n): ");
     choice = sc.next();
     System.out.println();
        }

       
    }
}