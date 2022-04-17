package question1;

import java.util.Scanner;

public class Asciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to know ascii value");
		int n=sc.next().charAt(0);
		System.out.println("The Ascii value of character is "+n);
		sc.close();
		System.out.println();
		
	}

}
