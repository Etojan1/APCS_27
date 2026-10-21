/*
 *	Author:  
 *  Date: 
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();
	public static void main(String args[]) throws InterruptedException {
	Scanner sc = new Scanner(System.in);
int choice = 0;
System.out.println("Welcome to Type Quest");
System.out.println("It is currently " + getTime());
System.out.println("Type the sentence as fast as possible!");
while (choice != 3) {
    System.out.println();
    System.out.println("1 - Play random");
    System.out.println("2 - Play set");
    System.out.println("3 - Quit");
    choice = sc.nextInt();
    sc.nextLine();
    String sentence = "";
    if (choice == 1) {
        sentence = getSentence();
    } else if (choice == 2) {
        System.out.println("Choose a sentence number from 0 to 99:");
        int number = sc.nextInt();
        sc.nextLine();

        while (number < 0 || number > 99) {
            System.out.println("Enter a number from 0 to 99:");
            number = sc.nextInt();
            sc.nextLine();
        }
        sentence = getSentence(number);
    }
    if (choice == 1 || choice == 2) {
        System.out.println("Your sentence is:");
        System.out.println(sentence);
        countdown();
        startTimer();
        String typed = sc.nextLine();
        double time = endTimer();
        int errors = compareSentences(sentence, typed);
        int letters = lettersInSentence(sentence);
        int words = wordsInSentence(sentence);
        double lettersPerMinute = letters / time * 60;
        double wordsPerMinute = words / time * 60;
        System.out.println("Time: " + time + " seconds");
        System.out.println("Errors: " + errors + " / " + letters);
        System.out.println("Letters per minute: " + lettersPerMinute);
        System.out.println("Words per minute: " + wordsPerMinute);
    } else if (choice != 3) {
        System.out.println("Please choose 1, 2, or 3.");
    }
}
System.out.println("Thanks for playing");

		
	}

	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	public static void startTimer(){
		startTime = System.nanoTime();
	}

	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
