/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Would you like to be a Wizard,Warrior, Rogue ");
	String choice = sc.nextLine();
	if(choice.equalsIgnoreCase("Wizard")){
		System.out.println("You have chosen the Wizard! Excelsior!");
}else if (choice.equalsIgnoreCase("Warrior")){
	System.out.println("You have chosen the Warrior! For Honor!");
}else if (choice.equalsIgnoreCase("Rogue")){
	System.out.println("You have chosen the Rogue! How cunning!");
}else
	System.out.println("You have decided not to choose a role. Return program");
}
}
