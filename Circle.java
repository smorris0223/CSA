public class Circle {
    private double radius;

public Circle (double r){
    radius = r;
}
public double area(){
    double a = Math.pow(radius, 2);
    return (a*Math.PI); 
}
public double circumference(){
    double d = 2*radius;
    return (d*Math.PI);}

public double getr(){
    return radius;
}

}
