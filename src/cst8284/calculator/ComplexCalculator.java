package cst8284.calculator;

public class ComplexCalculator {
	
	private java.util.Scanner op = new java.util.Scanner(System.in);
	private Complex c;  // stores result of current calculation 
	
	public ComplexCalculator(Complex c1, Complex c2){
		
		System.out.println("Which math operation do you wish to perform?  Enter +, -, *, /");
				
		switch (op.nextLine().charAt(0)){
		   case '+':
		      setComplexResult(add(c1, c2));
		      break;
		   case '-':
			  setComplexResult(subtract(c1, c2));
			  break;
		   case '*':
			  setComplexResult(multiply(c1, c2));
			  break;
		   case '/':
			  setComplexResult(divide(c1, c2));
			  break;
		   default:
			  System.out.println("Unknown operation requested");
		}		
	}
	
	public ComplexCalculator() {}  // Needed for Lab 4; do not change
	
	public Complex add(Complex c1, Complex c2){
		double real = c1.getReal() + c2.getReal();
		double imag = c1.getImag() + c2.getImag();
		return(new Complex(real, imag));
	}

   	public Complex subtract(Complex c1, Complex c2){
		double real = c1.getReal() - c2.getReal();
		double imag = c1.getImag() - c2.getImag();
		return(new Complex(real, imag));
	}
	
	public Complex multiply(Complex c1, Complex c2){
		double real = c1.getReal() * c2.getReal() - c1.getImag() * c2.getImag(); 
		double imag = c1.getReal() * c2.getImag() + c2.getReal() * c1.getImag();
		return(new Complex(real, imag));
	}
	
	public Complex divide(Complex c1, Complex c2){		
	   	if(c2.getReal() == 0.0 && c2.getImag() == 0.0) {
			System.out.println("Divide-by-zero error detected");
			return(new Complex());
		}else {
			double real = (c1.getReal() * c2.getReal() + c1.getImag() * c2.getImag()) / (c2.getReal() * c2.getReal() + c2.getImag() * c2.getImag()); 
			double imag = (c2.getReal() * c1.getImag() - c1.getReal() * c2.getImag()) / (c2.getReal() * c2.getReal() + c2.getImag() * c2.getImag());
			return(new Complex(real, imag));
		}
	}
	
	// Bonus C
//	public Complex divide(Complex c1, Complex c2){		
//	   	if(c2.isZero() || (1 / (multiply(c2, c2.conjugate()).getReal())) == 0.0) {
//	   		System.out.println("Divide-by-zero error detected");
//	   		return(new Complex());
//	   	}else
//			return multiply (multiply(c1, c2.conjugate()) , new Complex( (1 / (multiply(c2, c2.conjugate()).getReal())), 0.0));
//	}
	
	
	public void setComplexResult(Complex c) {
		this.c = c;
	}

	public Complex getComplexResult(){
	    return c;
	}

	public String toString(){
		return c.toString();
	}
	
}
