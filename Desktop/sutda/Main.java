package sutda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ����â ����(��Ʈ�� +2ī���ΰ� 3ī���ΰ�+ ����̼� �÷����� ���ΰ�?)
		//2. Ŭ������ �̸�, �н������ �α��� ������ â �����
		//3. ���ñ�� ���� â ����� (Ŭ��)
		//4. ĳ�ű�� ���� â ����� (Ŭ��)
		
		//������ ������ �� 
		System.out.println("2 Cards Game or 3Cards Game?");
		
		
		Player P1 = new Player();
		Player P2 = new Player();
		Dealer D = new Dealer();
		ArrayList<Card> Deck = new ArrayList<Card>();
		D.GameStart();
		//D.GameType = null;
		int j=0;
		P1.First = true;
		P2.First = false;
		
		
		while(D.state == true) {
			int k;
			Scanner scan = new Scanner(System.in);
			String option;
			
			//���� ����
			System.out.println("Let's start the Game!");
			Deck = D.MakeDeck();
			
			D.shuffle(Deck);
			P1.hand = D.distrib(Deck);
			P2.hand = D.distrib(Deck);
			//D.FirstBetting();
			
			
			
			System.out.println("Let's start Betting!");
			if(P1.First == true && P2.First == false) {
				
				while(true) {
					
					// �÷��̾� 1����
					
					System.out.println("Player 1's Betting Turn!");
					System.out.println("What's your Betting?");
					option = scan.nextLine();
					k = Integer.parseInt(option);
					switch(k) {
					case 1 : 
						P1.check(D);
						break;
					case 2 :
						P1.bbing(D);
						break;
					case 3 :
						P1.ddadang(D);
						break;
					case 4 :
						P1.half(D);
						break;
					case 5 :
						P1.call(D);
						break;
					case 6 :
						P1.die(D);
						break;
					}
					
					if(P1.state == false) {
						System.out.println("Betting Stopped!");
						P1.First = false;
						P2.First = true;
						break;
					}
					
					//�÷��̾� 2 ����
					System.out.println("Player 2's Betting Turn!");
					System.out.println("What's your Betting?");
					option = scan.nextLine();
					k = Integer.parseInt(option);
					switch(k) {
					case 1 : 
						P1.check(D); 
						break;
					case 2 :
						P1.bbing(D);
						break;
					case 3 :
						P1.ddadang(D);
						break;
					case 4 :
						P1.half(D);
						break;
					case 5 :
						P1.call(D);
						break;
					case 6 :
						P1.die(D);
						break;
					}
					if(P2.state == false) {
						System.out.println("Betting Stopped!");
						P1.First = false;
						P2.First = true;
						break;
					}
					
					if(D.GameType == 3) {
						P1.hand[3] = D.additionaldist(Deck);
						P2.hand[3] = D.additionaldist(Deck);
						D.GameType = 0;
					}
				}
			}
			if(P1.First == false && P2.First == true) {
					
				while(true) {
						
					// �÷��̾� 2����	
					System.out.println("Player 2's Betting Turn!");
					System.out.println("What's your Betting?");
					option = scan.nextLine();
					k = Integer.parseInt(option);
					switch(k) {
					case 1 : 
						P1.check(D); 
						break;
					case 2 :
						P1.bbing(D);
						break;
					case 3 :
						P1.ddadang(D);
						break;
					case 4 :
						P1.half(D);
						break;
					case 5 :
						P1.call(D);
						break;
					case 6 :
						P1.die(D);
						break;
					}
					if(P2.state == false) {
						System.out.println("Betting Stopped!");
						P1.First = true;
						P2.First = false;
						break;
					}
					System.out.println("Player 1's Betting Turn!");
					System.out.println("What's your Betting?");
					option = scan.nextLine();
					k = Integer.parseInt(option);
					switch(k) {
					case 1 : 
						P1.check(D);
						break;
					case 2 :
					P1.bbing(D);
						break;
					case 3 :
						P1.ddadang(D);
						break;
					case 4 :
						P1.half(D);
						break;
					case 5 :
						P1.call(D);
						break;
					case 6 :
						P1.die(D);
						break;
					}
						
					if(P1.state == false) {
						System.out.println("Betting Stopped!");
						P1.First = true;
						P2.First = false;
						break;
					}
					
					if(D.GameType == 3) {            /// hand�� ��ó�� ī�峪���ٶ� temp�� �����ֱ⶧���� �����غ�����
						P2.hand[3] = D.additionaldist(Deck);
						P1.hand[3] = D.additionaldist(Deck);
						D.GameType = 0;
					}
				}
			}
			
			
			int count = 0;
			System.out.println("Player 1, Continue Game?");
			// ���콺�� ��, �ƴϿ� Ŭ�� ��  �ƴϿ� Ŭ���� ī��Ʈ +1
			System.out.println("Player 2, Continue Game?");
			// ���콺�� ��, �ƴϿ� Ŭ�� ��  �ƴϿ� Ŭ���� ī��Ʈ +1
			count++;
			D.regame(count);
			
			
			
		}
	}
}
