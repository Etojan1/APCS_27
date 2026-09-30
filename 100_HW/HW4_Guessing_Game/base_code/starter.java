/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int game = (int)(Math.random() * 3) + 1;
		System.out.println("The goal of the game is to guess a word with two hints");
		if (game == 1) {
		System.out.println("It's one of the seven continents");
		String guess = sc.nextLine();
		if (guess.equals("Europe")) {
    System.out.println("You got it! Woo!");
} else {
    System.out.println("You sadly didnt get it heres another hint it has no deserts");
	guess = sc.nextLine();
       
    if (guess.equals("Europe")) {
        System.out.println("You got it! Woo!");
	}
	else 
        System.out.println("Sorry! The answer was Europe.");}
}
if (game == 2) {
		System.out.println("Its a fruit");
		String guess = sc.nextLine();
		if (guess.equals("Orange")) {
    System.out.println("You got it! Woo!");
	} else {
    System.out.println("You sadly didnt get it heres another hint which came first the color or the ");
	guess = sc.nextLine();
    if (guess.equals("Orange")) {
        System.out.println("You got it! Woo!");
	}
     else {
        System.out.println("Sorry! The answer was Orange.");
	 }
	}
}
if (game == 3) {
		System.out.println("Its a video game");
		String guess = sc.nextLine();
		if (guess.equals("Cyberpunk")) {
    System.out.println("You got it! Woo!");
	} else {
    System.out.println("You sadly didnt get it heres another hint its futuristic ");
	guess = sc.nextLine();
    if (guess.equals("Cyberpunk")) {
        System.out.println("You got it! Woo!");
	}
     else {
        System.out.println("Sorry! The answer was Cyberpunk.");
	}
}
}
	}
}
