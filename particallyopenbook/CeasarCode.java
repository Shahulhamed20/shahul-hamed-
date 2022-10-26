package partiallyopenbook4.java;

import java.util.Scanner;

public class CeasarCode {

	public static void main(String[] args) {
		String Str,cipher="";
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the string");
		Str=Scan.next().toUpperCase();
		Scan.close();
		char ch;
		for(int get=0;get<Str.length();get++) {
			ch=Str.charAt(get);
			if(ch=='x' ||ch=='y' ||ch=='z') {
				cipher=cipher+((char) (ch-23));
			}
			else {
				cipher=cipher+((char) (ch+3));
			}
		}

		System.out.println("the ciphered code is  "+cipher);
	}

}
