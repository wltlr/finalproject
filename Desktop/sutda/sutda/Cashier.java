package sutda;

import java.util.*;
public class Cashier {
	
	// ĳ���� ����� Ŭ���� gui�� ������ �� 
	
	public void Identify(Player p) {
		Scanner scan = new Scanner(System.in);
		String temp;
		System.out.println("Please enter your password!");
		temp = scan.nextLine();
		
		if(temp == p.password) {
			System.out.println("How can I help you?\n 1. Deposit  2. Withdraw");
		} 
		
		
	}
	
	public void Deposit(Player P) {
		System.out.println("How much will you deposit?");
		Scanner scan = new Scanner(System.in);
		String temp;
		temp = scan.nextLine();
		int k = Integer.parseInt(temp);
		
		if(k<P.money) {
			P.money -= k;
			P.balance += k ;
		}
		else {
			System.out.println("Not enough money in your hand!");
		}

		
	}
	
	public void Withdraw(Player P) {
		System.out.println("How much will you withdraw?");
		Scanner scan = new Scanner(System.in);
		String temp;
		temp = scan.nextLine();
		int k = Integer.parseInt(temp);
		if(k<P.balance) {
			P.balance -= k ;
			P.money += k;
		}
		else {
			System.out.println("Not enough money in your balance!");
		}
	}
	
}
