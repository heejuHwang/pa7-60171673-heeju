package PA7;
//60171673 황희주
abstract public class Shape implements Drawable {
	double x,y;
	public Shape(double x, double y) {
		this.x = x;
	    this.y = y;
	} 
	
	public abstract double getArea();
	public abstract double getLength();
	   //추상메소드
}
