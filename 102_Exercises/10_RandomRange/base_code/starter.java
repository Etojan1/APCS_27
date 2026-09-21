/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number to create a range for your random number");
		System.out.println("Please enter a integer");
		int int1 = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first)");
		int int2 = sc.nextInt();

		System.out.println("Your range is " + int1 + " to " + int2);
		System.out.println("Here are 5 numbers generated in that range");
		int a = (int)(Math.random() * (int2 - int1) + int1);
		System.out.println(a);
		a = (int)(Math.random() * (int2 - int1) + int1);
		System.out.println(a);
		a = (int)(Math.random() * (int2 - int1) + int1);
		System.out.println(a);
		a = (int)(Math.random() * (int2 - int1) + int1);
		System.out.println(a);

	
	}
}
