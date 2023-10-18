public class Cylinder {
   private Circle base;
   private double height;

    public Cylinder(double r, double h){
        base = new Circle(r);
        height =h;

    }

   public double vol(){
    double b = base.area();
    return 2*b*height;
    
   }
   public double sa(){
    //surface area = 2piRh+2piR^2
    double c = base.circumference();
    double a = base.area();
    return 2*c*height+2*a;
   }
}   


