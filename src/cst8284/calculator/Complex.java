package cst8284.calculator;

public class Complex {
	private double real = 0;
	private double imag = 0;

	public Complex(String cStr) {
		this(cStr.split("(?=\\+)|(?=\\-)"));
	}

	public Complex(String[] cStr) {
		this(cStr[0], cStr[1]);
	}

	public Complex(String r, String i) {
		this(Integer.parseInt(r), Integer.parseInt(i.replaceAll("i", "")));
	}

	public Complex(int r, int i) {
		this((double) r, (double) i);
	}

	public Complex(double r, double i) {
		setReal(r);
		setImag(i);
	}

	public Complex() {
		this(0, 0);
	}

	public double getReal() {
		return real;
	}

	public double getImag() {
		return imag;
	}

	public void setReal(double r) {
		this.real = r;
	}

	public void setImag(double i) {
		this.imag = i;
	}

	public Complex getComplex() {
		return this;
	}

	public String toString() {
		if (getImag() >= 0)
			return getReal() + " + " + getImag() + "i";
		else
			return getReal() + " - " + (-getImag()) + "i";

	}

	// Bonus A
	public boolean isZero() {
		return getReal() == 0.0 && getImag() == 0.0;
	}

	// Bonus C
	public Complex conjugate() {
		return new Complex(getReal(), -getImag());
	}

	public boolean equals(Complex c) {
		return getReal() == c.getReal() && getImag() == c.getImag();
	}

	public boolean equals(int real, int imag) {
		return equals(new Complex(real, imag));
	}

	public boolean equals(String c) {
		return equals(new Complex(c));
	}

	public boolean equals(double real, double imag, double delta) {
		return Math.abs(getReal() - real) < delta && Math.abs(getImag() - imag) < delta;
	}

}
