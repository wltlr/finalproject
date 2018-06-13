package sutda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 게임창 구현(인트로 +2카드인가 3카드인가+ 몇명이서 플레이할 것인가?)
		//2. 클릭으로 이름, 패스워드로 로그인 가능한 창 만들것
		//3. 베팅기능 선택 창 만들것 (클릭)
		//4. 캐셔기능 선택 창 만들것 (클릭)
		
		//게임을 시작한 후 
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
			
			//게임 시작
			System.out.println("Let's start the Game!");
			Deck = D.MakeDeck();
			
			D.shuffle(Deck);
			P1.hand = D.distrib(Deck);
			P2.hand = D.distrib(Deck);
			//D.FirstBetting();
			
			
			
			System.out.println("Let's start Betting!");
			if(P1.First == true && P2.First == false) {
				
				while(true) {
					
					// 플레이어 1베팅
					
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
					
					//플레이어 2 베팅
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
						
					// 플레이어 2베팅	
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
					
					if(D.GameType == 3) {            /// hand를 맨처음 카드나눠줄때 temp로 나눠주기때문에 생각해봐야함
						P2.hand[3] = D.additionaldist(Deck);
						P1.hand[3] = D.additionaldist(Deck);
						D.GameType = 0;
					}
				}
			}
			
			
			int count = 0;
			System.out.println("Player 1, Continue Game?");
			// 마우스로 예, 아니오 클릭 후  아니오 클릭시 카운트 +1
			System.out.println("Player 2, Continue Game?");
			// 마우스로 예, 아니오 클릭 후  아니오 클릭시 카운트 +1
			count++;
			D.regame(count);
			
			
			
		}
	}
}
