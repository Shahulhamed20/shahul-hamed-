package helloworld26.java;
import java.util.Scanner;
public class ArrayInput {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elments:");
		for (int i=0; i<10; i++)
		{
			array[i] =Scanner.nextInt();
			
		}
for(int num : array ) {
	sum = sum+num;
}
System.out.println("sum of array elements is:"+sum);
	}

}
