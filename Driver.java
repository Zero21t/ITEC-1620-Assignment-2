package Fall22;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		//create objects
		Circle c = new Circle();
		Circle p = new Circle();
		//uses first obj and uses get and setters
		double AREA = c.calculateArea();
		double PERIMETER = c.calculatePerimeter();
		System.out.println("The first circle is "+ c.getColor() + " and has radious of "+ c.getRadious()+ ", area of " + AREA + " and perimeter of " + PERIMETER+"\n");
		p.setRadious(0);
		p.setColor(null);
		//second circle entry//
		double r = 0;
		System.out.println("Please enter the radius for the second circle: ");
		//take radious input//
		r = input.nextDouble();
		//if r is less then 0 inlcuding negative run while)
		while(r<0) {
			//if r becomes greater then 0 stops while code else ask again for new r//
			if(r>0) {
				p.setRadious(r);
			}else{
				System.out.print("Please enter a positive value of the radius for the second circle: ");
					r = input.nextDouble();
					
			}
		}//if r is greater then 0 on first try ask for color and calculate and print msg//
			if(r>0) {
				
				p.setRadious(r);
				System.out.println("Please enter the color for the second circle:");
				String co = input.next();
				p.setColor(co);
				double result1 = Circle.calculateArea();
				double result2 = Circle.calculatePerimeter();
				System.out.println("The second circle is "+ c.getColor() + " and has radious of "+ c.getRadious()+ ", area of " + result1 + " and perimeter of " + result2+"\n");		
			}
			p.setRadious(0);
			System.out.println("Please enter the new radius for the second circle: ");
			//take radious input//
			r = input.nextDouble();
			//if r is less then 0 inlcuding negative run while)
			while(r<0) {
				//if r becomes greater then 0 stops while code else ask again for new r//
				if(r>0) {
					p.setRadious(r);
				}else{
					System.out.print("Please enter a positive value for the new radius for the second circle:");
						r = input.nextDouble();
						
				}
			}//if r is greater then 0 on first try calculate and print msg//
				if(r>0) {
					
					p.setRadious(r);
					double result1 = Circle.calculateArea();
					double result2 = Circle.calculatePerimeter();
					System.out.println("The second circle is "+ c.getColor() + " and has radious of "+ c.getRadious()+ ", area of " + result1 + " and perimeter of " + result2);		
				}
			
		
		
		

	}

}
