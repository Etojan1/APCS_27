/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()* 1000) + 1;
		System.out.println("Pick a number between 1 - 1000:");
		int number = sc.nextInt();
		
	     if(a==900){ 
			System.out.println("You got it right");
	}else{;
		System.out.println("Your number wasn't the random number. The number was " + a);
	}
}
}