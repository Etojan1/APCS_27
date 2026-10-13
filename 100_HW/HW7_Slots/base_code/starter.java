/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int money = 100;
        System.out.println("Slot Machine Rules:");
        System.out.println("Each player starts with $100.");
        System.out.println("Enter a wager up to your total money.");
        System.out.println("The slot machine rolls 3 numbers from 1 to 10.");
        System.out.println("Two matching numbers = double your wager.");
        System.out.println("Three matching numbers = triple your wager.");
        System.out.println("No matching numbers = lose your wager.");
        System.out.println("----------------------------------------");
        while (money > 0) {
            System.out.print("Would you like to play? (Yes/yes/Y/y): ");
            String choice = sc.next();
            if (choice.equals("No") || choice.equals("no")|| choice.equals("N") || choice.equals("n")) {
                break;
            }
            if (choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y")) {
                System.out.print("You have $" + money + ". How much would you like to wager");
                int wager = sc.nextInt();
                while (wager <= 0 || wager > money) {
                    System.out.print("Enter a wager between $1 and $" + money + ": ");
                    wager = sc.nextInt();
                }
                System.out.println("Great! Let's play!");
                int roll1 = (int) (Math.random() * 10) + 1;
                int roll2 = (int) (Math.random() * 10) + 1;
                int roll3 = (int) (Math.random() * 10) + 1;
                System.out.println("Your rolls are:");
                System.out.println("--------------------");
                System.out.println("| " + roll1 + " | " + roll2 + " | " + roll3 + " |");
                System.out.println("--------------------");
                money = money - wager;
                if (roll1 == roll2 && roll2 == roll3) {
                    money = money + wager * 3;
                    System.out.println("Jackpot You won $" + (wager * 3) + "!");
                } else if (roll1 == roll2 || roll1 == roll3 || roll2 == roll3) {
                    money = money + wager * 2;
                    System.out.println("Two numbers match! You won $" + (wager * 2));
                } else {
                    System.out.println("Didn't win this time, better luck next time");
                }
                System.out.println("You now have $" + money + ".");
                System.out.println("----------------------------------------");
            } else {
                System.out.println("That wasn't quite the correct answer. Try again.");
            }
        }
        if (money == 0) {
            System.out.println("You ran out of money");
        }
        System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon thanks!");
       
    }
}
	

