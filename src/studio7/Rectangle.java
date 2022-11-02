package studio7;

import java.util.Scanner;

public class Rectangle {
	private double width;
	private double length;
	private double area;
	private double circumference;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		this.area = width * length;
		this.circumference = (width + length) * 2;
	}
	
	public void print(Rectangle a) {
		System.out.println("Rectangle width is " + a.width);
		System.out.println("Rectangle width is " + a.length);
		System.out.println("Rectangle area is " + a.area);
		System.out.println("Rectangle circumference is " + a.circumference);
		if (a.width == a.length) {
			System.out.println("Your rectangle is a square.");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter rectangle width: ");
		double width = in.nextDouble();
		System.out.println("Enter rectangle length: ");
		double length = in.nextDouble();
		
		Rectangle a = new Rectangle(width, length);
		a.print(a);
	}

}
