/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pick a number between 1-1000");
		int num = sc.nextInt();
		int a = (int)(Math.random() * 1000) + 1;
		if(num == a){
		System.out.println("Your number was right");
		
	}else
	System.out.println("Your number wasnt right the right number was " + a);
}
}
