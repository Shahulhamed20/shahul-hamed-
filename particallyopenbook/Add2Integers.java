package partiallyopenbook;

import java.util.Scanner;

public class Add2Integers {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
		System.out.println("enter the first integer");
				int num1=scan.nextInt();
				System.out.println("enter the second integer");
				int num2=scan.nextInt();
				int sum=num1+num2;
				System.out.println("the sum is "+sum);

	}
	}

}
