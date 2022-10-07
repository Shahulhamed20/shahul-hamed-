package helloworld16.java;

import java.util.Scanner;

public class whileLoopDemo {

	public static void main(String[] args) {
		int number, sum = 0;
		Scanner sc = new scanner(System.in);
		System.out.println("n please enter any integer value below 10: ");
		number =sc.nextInt();
		
		while(number <= 10) {
			sum = sum + number;
			number++;
			
		}
System.out.format(" sum of th numbers from the while loop is: %d",sum);

	}

}
