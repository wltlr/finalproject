package sutda;

import java.util.*;


public class Player {
	
	String name;
	String password;
	int money;
	int Jokboscore;
	Card[] hand;
	int balance;
	boolean state; //true = keep betting false = dead
	boolean First; //true = ������ false = �ĺ���
	
	Player(){
		this.money = 5000000;
		this.balance = 0;
	}
	
	//Betting Skills
	public void half(Dealer D) {
		if(this.money > D.totalbet/2) {
			System.out.println("Half!");
			this.money -= D.totalbet/2;
			D.previousbet = D.totalbet/2;
			D.totalbet += D.totalbet/2;
			this.state = true;
		}
		else System.out.println("Not enough money!");
	}
	
	public void bbing(Dealer D) {
		if(this.money > D.normalbet) {
			System.out.println("BBing!");
			this.money -= D.normalbet;
			D.previousbet = D.normalbet;
			D.totalbet += D.normalbet;
			this.state = true;
		}
		else System.out.println("Not enough money!");	
	}
	
	public void call(Dealer D) {
		if(this.money > D.previousbet) {
			System.out.println("Call!");
			this.money -= D.previousbet;
			D.totalbet += D.previousbet;
			this.state = false;
		}
		else System.out.println("Not enough money!");	
	}
	
	public void die(Dealer D) {
		System.out.println("I'm dead.");	
		state = false;
	}
	
	public void ddadang(Dealer D) {		//�� ������ ���þ׿� 2�踦 �����Ѵ�. �� ������ üũ�� ��� �⺻����
		if(this.money > D.previousbet *2) {
			System.out.println("Ddadang!");
			this.money -= D.previousbet *2;
			D.previousbet = D.previousbet *2;
			D.totalbet += D.previousbet *2;	
			this.state = true;
		}
		else System.out.println("Not enough money!");
			
		
	}
	public void check(Dealer D) { //���� ���� �÷��̾ ó������ ������ ����, ���� �����ʰ� ���� �ѱ��.
		System.out.println("Check.");
		D.previousbet = 0;
		this.state = true;
	}
	
	public void discard() { //���콺Ŭ���� �̿��� ī�带 ���� ������. 3�� �����϶��� �ʿ��� ���
		
	}
}
