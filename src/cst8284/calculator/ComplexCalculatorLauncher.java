package cst8284.calculator;
import java.util.Scanner;

public class ComplexCalculatorLauncher {
	
   private static Scanner input = new Scanner(System.in);
   private static int choice = 0;
   private static ComplexCalculator calc;
   private static final int SINGLE_STRING = 1, DOUBLE_STRING = 2, TWO_INTS = 3;
   private static int count = 0;
      
   public static void main(String[] args) {
		
		System.out.println("Welcome to the Complex Calculator\n");

		do {
			Complex c1 = ComplexCalculatorLauncher.getComplexNumber();
			Complex c2 = ComplexCalculatorLauncher.getComplexNumber();
			if ((c1 == null) || (c2 == null))
				break;
			calc = new ComplexCalculator(c1, c2);
			System.out.println("The result is: " + calc.toString());
			System.out.println("Do you wish to continue? Enter Q to quit or any other char to continue");
		} while (input.next().charAt(0) != 'Q');

		System.out.println("Exiting Complex Calculator");
	}
   
   
   private static Complex getComplexNumber(){
	   
	   choice = ComplexCalculatorLauncher.displayTypeInputMenu();
   	   input.nextLine(); 
   	   
       // Bonus B
   	   System.out.printf("Enter the %s number ", ++count%2 == 1? "first" : "second");
   	   
       switch(choice){
       
          case SINGLE_STRING:
         	 System.out.println("as a single string, e.g. 4-3i");
        	 String strComplex = input.next();
    	     return(new Complex(strComplex));
    	     
          case DOUBLE_STRING:
         	 System.out.println("as two separate strings, with a space in between, e.g. 4 -3i");
        	 String strReal = input.next(), strImag = input.next();
    	     return(new Complex(strReal, strImag));
    	     
          case TWO_INTS:
         	 System.out.println("as two integers, where the 2nd int is the imaginary number, e.g. 4 3");
        	 int iReal = input.nextInt(), iImag = input.nextInt();
    	     return(new Complex(iReal, iImag));
    	     
          default:
        	 System.out.println("Bad input choice; exiting\n");
        	 return(null);
       }
   }
   
   
   private static int displayTypeInputMenu(){
      System.out.printf("%s\n\t%s\n\t%s\n\t%s", 
    	 "Enter the format of the complex number to be entered:", 
  		 SINGLE_STRING + ". A single string",
         DOUBLE_STRING + ". Two strings",
         TWO_INTS + ". Two integer values\n");
      return(input.nextInt());
   }
   
}
