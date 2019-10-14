import java.util.Scanner;

public class GuessGameGroup {
//Main
	public static void main(String[] args) {
		 final int LIMIT = 100;
	        
	        displayWelcome(LIMIT);
	        int number = getRandomInt(LIMIT);
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	//        @SuppressWarnings("resource")
	        Scanner sc = new Scanner(System.in);            
	        int count = 1;
	        int guess = 0;
	        while (guess!=number) {
	        	guess = getIntWithinRange(sc,
	        			"Your guess:", 0, 101);
	      
	            
	            if (guess < 1 || guess > LIMIT) {
	                System.out.println("Invalid guess. Try again.");
	                continue;
	            }
	            
	            //checking for how far the difference
	            int diff = guess - number;
	            String msg;
	            if (diff <= -10) {
	            	msg = "way too low!";
	            }
	            else if (diff < 0) {
	            	msg = "too low!";
	            }
	            else if (diff > 10) {
	            	msg = "way too high!";
	            }
	            
	            else if (diff > 0) {
	            	msg = "too high!";
	            }
	            
	            
	  //          if (guess < number) {
	    //            System.out.println("Too low.");
	      //      } else if (guess > number) {
	        //        System.out.println("Too high.");
	           else {
	         	printFinish(count);
	                msg = "You guessed it in " +count+ " tries. \n";
	                                
	                break;
	            }            
	            count++;
	        } //while
	        
	        choice = continueYN ("Another guess? y/n ", sc );
	        
	  //      System.out.print("another guess? (y/n): ");
     //    choice = sc.next();
         System.out.println();
	   //     System.out.println("Bye!");
	        }
	     //   }//while
	        
	      
	        System.out.println("Bye!");
	    }   	
	//function displayWelcome	
		  private static void displayWelcome(int limit) {
		        System.out.println("Guess the number!");
		        System.out.println("I'm thinking of a number from 1 to " + limit);
		        System.out.println();
		    }
	//function getRandomInt	    
		    public static int getRandomInt(int limit) {
		        double d = Math.random() * limit;   // d is >= 0.0 and < limit
		        int randomInt = (int) d;            // convert double to int
		        randomInt++;                        // int is >= 1 and <= limit
		        return randomInt;
		    }
		    
		    // function printFinish
			  private static void printFinish(int count) {
			        if (count <= 3) {
				    System.out.println("Great Work Math WIZ!");
			        } else if (count > 3 && count <= 7) {
			        System.out.println("Not too bad you have potential " );
			        } else {
			        	System.out.println("What took so long?");
			        }
			  }

			  public static int getIntWithinRange(Scanner sc, String prompt,
			            int min, int max) {
			        int i = 0;
			        boolean isValid = false;
			        while (isValid == false) {
			            i = getInt(sc, prompt);
			            if (i <= min) {
			                System.out.println(
			                        "Error! Number must be greater than " + min + ".");
			            } else if (i >= max) {
			                System.out.println(
			                        "Error! Number must be less than " + max + ".");
			            } else {
			                isValid = true;
			            }
			        }
			        return i;
			    }

			    public static int getInt(Scanner sc, String prompt) {
			        int i = 0;
			        boolean isValid = false;
			        while (isValid == false) {
			            System.out.print(prompt);
			            if (sc.hasNextInt()) {
			                i = sc.nextInt();
			                isValid = true;
			            } else {
			                System.out.println("Error! Invalid integer. Try again.");
			            }
			            sc.nextLine();  // discard any other data entered on the line
			        }
			        return i;
			    }


	public static String continueYN(String prompt, Scanner sc) {
		boolean  isValid = false;
			  String choice = " ";
		while (!isValid) {
		//	String choice = " ";
			System.out.println(prompt);
			 
			 choice = sc.next();
			 if (choice.equalsIgnoreCase("y") || 
			    choice.equalsIgnoreCase("n")){
			     isValid = true;
			 }else {
		    	 System.out.println("try again");
			 		sc.nextLine(); //discard input
			 		continue;
			     }
	//		 return choice;
		}
	return choice;

	}
	
	// get random number
	private static int generateRandomNumber() {
		int r=(int)(Math.random()*100)+1;
		return r;
	}
	
} // end of program

	


