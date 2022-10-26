package partiallyopenbook3.java;

import java.util.Scanner;

public class AveragewithInputValidation {

	public static void main(String[] args) {
		final int MAX_STUDENT=3;
		
		int total=0,mark;
		double average;
		boolean isvalid=false;
		
		Scanner Scan = new Scanner(System.in);
				for(int i=1;i<=MAX_STUDENT;i++) {
					do{
						isvalid=false;
						System.out.println("enter the mark for student "+i);
						mark=Scan.nextInt();
						if(mark>=0&&mark<=100)
						{
							isvalid=true;
							total+=mark;
						}
						else
							System.out.println("enter a valid input");
					}while(!isvalid);
				}
		Scan.close();
		average=(double)total/MAX_STUDENT;
		System.out.printf("The average is %.2f",average);

	}

}
