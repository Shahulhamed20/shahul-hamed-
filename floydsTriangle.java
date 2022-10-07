package helloworld15.java;

public class floydsTriangle {

	public static void main(String[] args) {
	int rows, number = 1, counter,  j;
	
	scanner input = new scanner(System.in);
	System.out.println("enter the numbe of rows for floyd's triangle:");
	rows = input.nextInt();
	System.out.println("floyd's triangle");
	System.out.println("********************");
	for (counter =1 ; counter <= rows ; counter++ )
	{
		for( j = 1 ; j <= counter ; j++ )
		{
			System.out.print(number+" ");
			number++;
		
		}
		System.out.println();
	}
	

	}

}
