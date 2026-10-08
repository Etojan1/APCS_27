/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");
		String name = sc.nextLine();
		System.out.println("What is your title");
		String title = sc.nextLine();
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


		int points = 20;
		System.out.println("You have 20 points to spend");
		System.out.print("Strength (1-10): ");
		int Strength = sc.nextInt();
		points = points - Strength;
		System.out.println("You have " + points + " left to spend.");
		System.out.print("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		points = points - Dexterity;
		System.out.println("You have " + points + " left to spend.");
		System.out.print("Intelligence (1-10): ");
		int Intelligence = sc.nextInt();
		points = points - Intelligence;
		System.out.println("You have " + points + " left to spend.");
		System.out.print("Charisma  (1-10): ");
		int Charisma = sc.nextInt();
		points = points - Charisma;

        if(points > 0){
			System.out.println("You have " + points + " left to spend");
		}
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
        System.out.println("You're a " + choice + " with the following stats:");
        System.out.println("Strength - " + Strength);
        System.out.println("Dexterity - " + Dexterity);
        System.out.println("Intelligence - " + Intelligence);
        System.out.println("Charisma - " + Charisma);
        System.out.println("Good luck on your quest " + name + "!");
	}
}
