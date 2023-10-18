public class Fraction{
	private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
    public Fraction(){
        numerator=1;
        denominator=2;
    }
	
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	
	public Fraction subtract(Fraction other){
        int n = this.numerator*other.denominator - this.denominator*other.numerator;
        int d = this.denominator *other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }
        
    public Fraction multiply(Fraction other){
        int n = this.numerator*other.numerator;
        int d = this.denominator*other.denominator;
        Fraction result = new Fraction(n,d);
        return result;
    }
	
	
    public String toString(){
        String s = numerator + "/" + denominator;
		return s;
    }

	
    public Fraction reciprocal(){
        int newD = this.numerator;
        int newN = this.denominator;
        
        Fraction result = new Fraction(newN,newD);
        return result;
    }
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);	// print the answer
			
		
		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
		
		//Add code to multiply f1 and f2 here
		Fraction f5 = f1.multiply(f2);
		System.out.println(f1 + " * " + f2 + "=" + f5);
		//Add code to call reciprocal here
		
		Fraction f6 = f1.reciprocal();
		System.out.println("The reciprocal of " +f1 +" is " + f6);
		//create 2 new fractions and add them here.
		
		Fraction f7 = new Fraction(2,3);
		Fraction f8 = new Fraction();

		Fraction f9 = f7.add(f8);
		System.out.println(f7 + " + " + f8 + " = " +f9);
		

	}

}
