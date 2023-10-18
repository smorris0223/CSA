public class Line {
	private Point end1;
	private Point end2;
	
	public Line(double x1, double y1, double x2, double y2)
	{
		end1 = new Point(x1,y1);
		end2 = new Point(x2,y2);
		
	}
	public Line()		// default constructor
	{
		end1 = new Point();
		end2 = new Point();
	}
	
	public double distance()
	{
		double x1 = end1.getX();
		double x2 = end2.getX();
		double y1 = end1.getY();
		double y2 = end2.getY();
		
		double y = Math.pow((y2-y1), 2);
		double x = Math.pow((x2-x1), 2);

		double d = Math.sqrt(x+y);
		return d;
		//You may find Math.pow(base, power) and Math.sqrt(num) useful
	}
	public Point midpoint()
	{
		double x1 = end1.getX();
		double x2 = end2.getX();
		double y1 = end1.getY();
		double y2 = end2.getY();
		double midx = (x1+x2)/2;
		double midy = (y1+y2)/2;
		return new Point(midx, midy);
	}
	
	public boolean sameLength(Line otherLine)
	{
		double a = distance();
		double b = otherLine.distance();
		return Math.abs(a-b)<0.001;}
	
	public double slope()
	{
		double m;
		m = (end2.getY()-end1.getY())/(end2.getX()-end1.getX());
		return m;
		
	}
	public String toString()
	{
		String s = "Line with endpoints " + end1 + " and " + end2;
		return s;
	}
	
	public boolean parallel(Line otherLine)
	{
		double m1 = this.slope();
		double m2 = otherLine.slope();
		
		//return m1==m2;
		//because of roundoff error, it is not recommended that you compare 
		//two floats for equality, but that their difference is small
		return Math.abs(m1-m2)<=.0001;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l1 = new Line(-1,-3, 2,1);
		
		double m = l1.slope();
		System.out.println(l1);
		System.out.println("Slope = " + m);
		
		Line l2 = new Line(0,0,3,4);
		System.out.println(l2);
		System.out.println("Slope = " + l2.slope());
		System.out.println("Parallel? " + l1.parallel(l2));
		
		
		double dist = l1.distance();
		Point p1 = l1.midpoint();
		
		System.out.println("distance = " + dist);
		System.out.println("Midpoint = " + p1);
		
		System.out.println("distance = " + l2.distance());
		System.out.println("Same length? " + l1.sameLength(l2));

	}

}