package helloworld19.java;
import java.util.Scanner;
public class FindAreaOfRectangle {

	public static void main(String[] args) {
	    Scanner Scanner = new Scanner(System.in);
	    System.out.println("Enter the length of Rectangle:");
	    double length = Scanner.nextDouble();
	    System.out.println("Enter the width of Rectangle:");
	    double width = Scanner.nextDouble();
	    double area = length*width;
	    System.out.println("area of rectangle is:"+area);
	    
	    

	}

}
