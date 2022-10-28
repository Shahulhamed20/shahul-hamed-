package particallyopenbook26.java;

import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {
		static int Sum;
	        final int SENTINAL=-1;
	        int num;
	        Scanner scan=new Scanner(System.in);
	        System.out.print("Enter a positive integer (or -1 to end):");
	        num=scan.nextInt();
	        while(num!=SENTINAL){
	            if(hasEight(num)){
	                magix(num);
	            }
	            System.out.print("Enter a positive integer (or -1 to end):");
	            num=scan.nextInt();
	        }
	        scan.close();
	        System.out.println("The magic sum is "+Sum);
	    }

	    static boolean hasEight(int num){
	        boolean bool=false;
	        int check;
	        while(num>0){
	            check=num%10;
	            if(check==8){
	                bool=true;
	                break;
	            }
	            num=num/10;
	        }
	        return bool;
	    }

	    static void magix(int num){
	        Sum=Sum+num;

	}

}
