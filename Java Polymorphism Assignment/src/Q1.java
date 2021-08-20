
public class Q1 {
	static class Shape{
		public String color;
		
		public Shape(String color) {
			this.color = color;
		}
		
		public String toString() {
			return "Shape of color=\"" + color + "\"";
		}
		
		public double getArea() {
			 System.out.println("Shape unknown! Cannot compute area!");
			 return 0;
		}
		
	}
	
	static public class Rectangle extends Shape {
		private int length;
		private int width;
		
		public Rectangle(String color, int length, int width) {
			 super(color);
			 this.length = length;
			 this.width = width;
		}
		
		public String toString() {
			 return "Rectangle of length = " + length + " and width=" + width + ", subclass of " + super.toString();
		 }
		
		public double getArea() {
			 return length*width;
		 }

	}
	
	static public class Triangle extends Shape{
		private int base;
		private int height;
		
		public Triangle(String color, int base, int height) {
			 super(color);
			 this.base = base;
			 this.height = height;
		}
		
		public String toString() {
			 return "Triangle of base=" + base + " and height=" + height + ",subclass of " + super.toString();
			 }
		
		public double getArea() {
			 return 0.5*base*height;
			 }

	}
	
	public static void main(String[] args) {
		 Shape s1 = new Rectangle("red", 4, 5);
		 System.out.println(s1);
		 System.out.println("Area is " + s1.getArea());
		 
		 Shape s2 = new Triangle("blue", 4, 5);
		 System.out.println(s2);
		 System.out.println("Area is " + s2.getArea());
		 }


}
