package helloworld20.java;
import java.util.Scanner;
 
public class FindAreaOfSquare {
	 public static void main (String[] args)
	 {
		 System.out.println("Enter side of Square:");
		 Scanner Scanner = new Scanner(System.in);
		 double side = Scanner.nextDouble();
		 double area = side*side;
		 System.out.println("area of square is: "+area);
		 

	}
}
