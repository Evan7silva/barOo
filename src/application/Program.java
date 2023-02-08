package application;

import java.util.Locale;
import java.util.Scanner;

import account.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sex: ");
		bill.gender = sc.nextLine().charAt(0);
		System.out.print("Amount of beers: ");
		bill.beer = sc.nextInt();
		System.out.print("Amount of soda: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Amount of skewers: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println(bill);
		
		
		sc.close();

	}

}
