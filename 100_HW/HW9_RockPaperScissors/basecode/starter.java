/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
public static String getObject() {
        int num = (int)(Math.random() * 3) + 1;

        if (num == 1) {
            return "rock";
        }
        if (num == 2) {
            return "paper";
        }
        return "scissors";
    }

    public static int compare2(String p1, String p2) {
        if (p1.equals(p2)) {
            return 0;
        }

        if (p1.equals("rock") && p2.equals("scissors")) {
            return 1;
        }
        if (p1.equals("paper") && p2.equals("rock")) {
            return 1;
        }
        if (p1.equals("scissors") && p2.equals("paper")) {
            return 1;
        }

        return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play the computer? (yes/no/done)");
        String answer = sc.nextLine();

        while (!answer.equals("done")) {
            if (answer.equals("yes")) {
                System.out.println("------------------------------");
                System.out.println("Please enter rock/paper/scissors:");
                String player = sc.nextLine();
                while (!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")) {
                    System.out.println("Please enter rock/paper/scissors:");
                    player = sc.nextLine();
                }
                String computer = getObject();
                int winner = compare2(player, computer);

                if (winner == 0) {
                    System.out.println("It's a tie!");
                }
                if (winner == 1) {
                    System.out.println("You won!!!");
                }
                if (winner == 2) {
                    System.out.println("Computer won!!!");
                }
            }

            if (answer.equals("no")) {
                System.out.println("------------------------------");
                System.out.println("How many times would you like the computer to play itself?");
                int games = sc.nextInt();
                sc.nextLine();
                int p1wins = 0;
                int p2wins = 0;
                int ties = 0;
                for (int i = 0; i < games; i++) {
                    String p1 = getObject();
                    String p2 = getObject();
                    int winner = compare2(p1, p2);
                    if (winner == 0) {
                        ties = ties + 1;
                    }
                    if (winner == 1) {
                        p1wins = p1wins + 1;
                    }
                    if (winner == 2) {
                        p2wins = p2wins + 1;
                    }
                }
                System.out.println("Player 1 wins: " + p1wins);
                System.out.println("Player 2 wins: " + p2wins);
                System.out.println("Ties: " + ties);
            }
            System.out.println("------------------------------");
            System.out.println("Would you like to play the computer? (yes/no/done)");
            answer = sc.nextLine();
        }
        System.out.println("------------------------------");
        System.out.println("Thanks for playing!");

        sc.close();
    }
}
 