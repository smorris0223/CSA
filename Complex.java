public class Complex{
    private double realNum;
    private double imagNum;

    public Complex(double a, double b){
        realNum = a;
        imagNum = b;
    }
    public Complex(double a){
        this(a,0.0);
    }

//note for multiply (ac-bd)+(ad+cb)i

    public double abs(){
        double x = realNum*realNum;
        double y = imagNum*imagNum*-1;
        if(x+y>=0){return Math.sqrt(x+y);}
        else{return Math.sqrt(x+(y*-1));}
    }

public Complex add(Complex Other){
    double x = this.realNum+Other.realNum;
    double y = this.imagNum+Other.imagNum;
    return new Complex(x, y);
}
public Complex add(double x){
    return this.add(new Complex(x));
}

public String toString(){
     return realNum+" + "+imagNum+"i";
}

public Complex multiply(Complex other){
    double a = (this.realNum*other.realNum)-(this.imagNum*other.imagNum);
    double b = (this.realNum*other.imagNum)+(this.imagNum*other.realNum);
    return new Complex(a,b);
}

public Complex multiply(double x){
    return this.multiply(new Complex(x));
}

public static void main(String[] args) {
    Complex c1 = new Complex(2.0,2.0);
    Complex c2 = new Complex(3.5);
    Complex c3 = new Complex(0.0,1.5);
    Complex c4 = new Complex(-2.0,-1.0);
    Complex c5 = new Complex(-4.5);
    Complex c6 = new Complex(0.0,-1.5);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(c1.abs());
    System.out.println(c5.abs());
    System.out.println(c4.abs());
    System.out.println(c1.add(4.0));
    System.out.println(c1.add(c3));
    System.out.println(c4.add(c6));
    System.out.println(c1.multiply(5.0));
    System.out.println(c4.multiply(c6));
    System.out.println(c1.multiply(c4));






}}
