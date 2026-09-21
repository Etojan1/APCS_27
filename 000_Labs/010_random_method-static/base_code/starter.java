/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A number between 0-9");
		int a = (int)(Math.random() * 10);
		System.out.println(a);
		System.out.println("A number between 1-10");
		int b = (int)(Math.random() * 10) + 1;
		System.out.println(b);
		System.out.println("A number between 2.5-3.5");
		double c = (double)(Math.random() * 3.5) + 2.5;
		System.out.println(c);
		System.out.println("A number between 14-589");
		double d = (double)(Math.random() * 589) + 14;
		System.out.println(d);
}
}