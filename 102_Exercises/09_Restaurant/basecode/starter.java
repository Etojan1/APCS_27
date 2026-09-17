/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("WELCOME RESTAURANT OWNER!");
		System.out.println("=================================================");
		System.out.println("What is the name of your restaurant?");
		String restaurant = sc.nextLine();
		System.out.println("What's your name?");
		String name = sc.nextLine();
		System.out.println("Great to see you, " + name + "Let's set up a menu for java starter!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go! ");
		System.out.println("--- Item #1 ---");
		System.out.println("Item name");
		String oneitem = sc.nextLine();
		System.out.println("Price of $ "+ oneitem);
		double oneitemprice = sc.nextDouble();
		System.out.println("How many "+ oneitem + "would you like?");
		int oneitemq = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + oneitemq + "x " + oneitem + "x to your order!");
		System.out.println("--- Item #2 ---");
		System.out.println("Item name");
		String twoitem = sc.nextLine();
		System.out.println("Price of $" + twoitem);
		double twoitemprice = sc.nextDouble(); 
		System.out.println("How many " + twoitem + "would you like");
		int twoitemq = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + twoitemq + "x " + twoitem + "x to your order!");
		System.out.println("--- Item #3 ---");
		System.out.println("Item name");
		String threeitem = sc.nextLine();
		System.out.println("Price of" + threeitem);
		double threeitemprice = sc.nextDouble();
		System.out.println("How many " + threeitem + "would you like");
		int threeitemq = sc.nextInt();
		System.out.println("Added " + threeitemq + "x " + threeitem + "x to your order!:");
		System.out.println("What tip would you like to leave");
		System.out.println("ex(10, 15, 20)");
        int tip = sc.nextInt();
        System.out.println("================================================");
        System.out.println("              " + restaurant + " - Menu For Today");
        System.out.println("================================================");
        System.out.println("Owner: " + name);
        System.out.println("------------------------------------------------");
        System.out.println("Item                         Qty        Price");
        System.out.println("------------------------------------------------");
        System.out.println("oneitem                  " + oneitemq + "          $" + oneitemprice);
        System.out.println("twoitem        " + twoitemq + "          $" + twoitemprice);
        System.out.println("threeitem      " + threeitemq + "          $" + threeitemprice);
        System.out.println("------------------------------------------------");
        double subtotal = (oneitemprice * oneitemq) + (twoitemprice * twoitemq) + (threeitemprice * threeitemq);
        System.out.println("Subtotal: $" + subtotal);
        double tipdeci = tip * 0.01;
        double tipsub = subtotal * tipdeci;
        System.out.println("Tip (" + tip + "%): $" + tipsub);
        double taxsub = 0.0975 * subtotal;
        System.out.println("Tax (9.75%): $" + taxsub);
        System.out.println("================================================");
        System.out.println("TOTAL: $" + (subtotal + tipsub + taxsub));
        System.out.println("================================================");

		
		
	}
}
