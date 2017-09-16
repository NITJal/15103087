package assignment1;

	abstract class Shape{
		abstract void NumberOfSides();
		}

		class Trapezoid extends Shape{
		void NumberOfSides(){
		System.out.println("It has 4 sides");
		}
		}	

		class Triangle extends Shape{
		void NumberOfSides(){
		System.out.println("It has 3 sides");
		}
		}

		class Hexagon extends Shape{
		void NumberOfSides(){
		System.out.println("It has 6 sides");
		}
		}

		public class Shapes {
		public static void main(String args[]){
		Trapezoid t=new Trapezoid();
		Triangle tri=new Triangle();
		Hexagon hex=new Hexagon();
		t.NumberOfSides();
		tri.NumberOfSides();
		hex.NumberOfSides();
		}

}
