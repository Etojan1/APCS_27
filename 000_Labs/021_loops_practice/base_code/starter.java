/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the guessing game!");
	    System.out.println("Please guess a number");
		int a = sc.nextInt();
		int b = (int)(Math.random() * 1000)+ 1;
		while(a!=b){
	    if(b<a){
			System.out.println("The number is lower");
		}else{
			System.out.println("The number is higer");
			 }
			 if(a!=b)
				System.out.println("Please guess another number");
			a = sc.nextInt();
			 if(a==b){
			System.out.println("Your got the number!");
			 }


        



		
	}
}
}
