package Fall22;

public class Circle {
	//private instance variables//
	private static double radious;
	private String color;
	private static double perimeter;
	private static double area;
	//constructor 
	public Circle(){radious=2.0; color="green";}
	//Parameterized constructor
	public Circle(double radious,String color){
		this.radious=radious;
		this.color=color;
	}
	
	//getter and setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadious() {
		return radious;
	}
	public void setRadious(double radious) {
		this.radious = radious;
	}

	//method
	 public static double calculateArea() {
		 Circle.area=Math.PI*(Math.pow(Circle.radious, 2));	
		return Circle.area;
	}
	
	 public static double calculatePerimeter() {
		Circle.perimeter = Math.PI*(Circle.radious/2);
		return Circle.perimeter;
	}
	
	

}

